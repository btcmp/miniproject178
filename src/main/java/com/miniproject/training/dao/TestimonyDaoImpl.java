package com.miniproject.training.dao;

import java.util.Date;
import java.util.List;

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
		Session session=sessionFactory.getCurrentSession();
		List<Testimony>testi=session.createCriteria(Testimony.class).list();
		return testi;
	}
	public void save(Testimony testimony) {
		// TODO Auto-generated method stub
		testimony.setCreatedOn(new Date());
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
		testimony.setModifiedOn(new Date());
		Session session=sessionFactory.getCurrentSession();
		session.update(testimony);
	}
	public void delete(long id) {
		// TODO Auto-generated method stub
		Testimony testi=new Testimony();
		testi.setDeletedOn(new Date());
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
