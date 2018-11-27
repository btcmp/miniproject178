package com.miniproject.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Role1;
import com.miniproject.training.model.User1;

@Repository
public class RoleDaoImpl1 implements RoleDao1 {

	@Autowired
	SessionFactory sessionFactory;
	public List<Role1> getAllUserRoles() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Role1> roles = session.createCriteria(Role1.class).list();
		return roles;
	}
	
	public void save(Role1 role){
		Session session = sessionFactory.getCurrentSession();
		session.save(role);
		session.flush();
	}

	public List<Role1> getRoleByUser(User1 user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Role r where r.users = :user";
		List<Role1> roles = session.createQuery(hql).setParameter("user", user).list();
		if(roles.isEmpty()){
			return null;
		}
		return roles;
	}

	public Role1 getRoleById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Role1.class, id);
	}
	
}
