package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Role;

@Repository
public class RoleDaoImpl implements RoleDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		String hql = "from Role";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Role> roles = query.list();
		if(!roles.isEmpty())
		{
			return roles;
		}
		return new ArrayList<Role>();
	}

	public void save(Role role) {
		// TODO Auto-generated method stub
		role.setCreatedOn(new Date());
		Session session = sessionFactory.getCurrentSession();
		session.save(role);
	}

	public Role searchById(String roleId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String query = "select r.id= :id from Role r where r.id='"+roleId+"'";
		Role role =  new Role();
		role = (Role) session.createQuery(query).setParameter("id", roleId);
		return role;
	}

	public Role getAllRoleById(long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Role rol where rol.id= :data";
		List<Role> role = session.createQuery(hql).setParameter("data", id).list();
		if(role.isEmpty())
		{
			return null;
		}
		return role.get(0);
	}
	
}
