package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Role;
import com.miniproject.training.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		String hql = "from User where active='1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<User> users = query.list();
		if(!users.isEmpty())
		{
			return users;
		}
		return new ArrayList<User>();
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		user.setCreatedOn(new Date());
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	public void deactivate(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
	}

	public User getAllUserById(long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User usr where usr.id = :data";
		List<User> user = session.createQuery(hql).setParameter("data",id).list();
		if(user.isEmpty())
		{
			return null;
		}
		return user.get(0);
	}
}
