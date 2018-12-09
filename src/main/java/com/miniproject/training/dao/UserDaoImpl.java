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
		String hql = "from User u where u.active='1' and u.role.active='1'";
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

	public void update(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User usr where usr.username = :username";
		Query query = session.createQuery(hql);
		query.setParameter("username", username);
		List<User> listUser = query.list();
		if(listUser.isEmpty()) {
			return new User();
		}
		
		return listUser.get(0);
	}

	public List<User> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from User u where lower(u.username) like lower('%"+name+"%')";
		Session session = sessionFactory.getCurrentSession();
		List<User> user = session.createQuery(hql).list();
		return user;
	}
}
