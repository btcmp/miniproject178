package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Testimony;

@Repository
public class TestimonyDaoImpl implements TestimonyDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public List<Testimony> getAllTestimony() {
		// TODO Auto-generated method stub
		String hql="from Testimony where isDelete = '0'";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		List<Testimony> testi=query.list();
		if(!testi.isEmpty()) {
			return testi;
		}
		return new ArrayList<Testimony>();
	}
	public void save(Testimony testimony) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(testimony);
	}
	public Testimony getAllTestimonyById(long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Testimony ts where ts.id= :data";
		List<Testimony> testi=session.createQuery(hql).setParameter("data",id ).list();
		if (testi.isEmpty()) {
			return null;
		}
		return testi.get(0);
	}
	public void update(Testimony testimony) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(testimony);
	}
	public void delete(long id) {
		// TODO Auto-generated method stub
		Testimony testi=new Testimony();
		testi.setId(id);
		Session session=sessionFactory.getCurrentSession();
		session.delete(session.get(Testimony.class, id));
	}
	public List<Testimony> searchTestimony(String search) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Testimony tst where lower(tst.title) like :search";
		List<Testimony> testimoni= session.createQuery(hql).setParameter("search", "%"+search.toLowerCase()+"%").list();
		return testimoni;
	}

}
