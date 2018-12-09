package com.miniproject.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Class;

@Repository
public class ClassDaoImpl implements ClassDao{

	@Autowired
	SessionFactory sessionFactory;
	public List<Class> getAllClass() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Class> classes=session.createCriteria(Class.class).list();
		return classes;
	}
	public void save(Class classes) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(classes);
	}
	public List<Class> searchBatch(String search) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Class cl where lower(cl.batch.name) like :search";
		List<Class> classes=session.createQuery(hql).setParameter("search", "%"+search.toLowerCase()+"%").list();
		return classes;
	}
	public void delete(long id) {
		// TODO Auto-generated method stub
		Class classes=new Class();
		classes.setId(id);
		Session session=sessionFactory.getCurrentSession();
		session.delete(session.get(Class.class, id));
	}

}
