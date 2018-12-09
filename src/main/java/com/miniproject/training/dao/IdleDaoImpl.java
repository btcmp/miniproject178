package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.IdleNews;

@Repository
public class IdleDaoImpl implements IdleDao {

	@Autowired
	SessionFactory sessionFactory;

	public List<IdleNews> getAllIdlenews() {
		// TODO Auto-generated method stub
		String hql = "from IdleNews i where i.isDelete ='1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<IdleNews> idlenews = query.list();
		if (!idlenews.isEmpty()) {
			return idlenews;
		}
		return new ArrayList();
	}

	public void save(IdleNews idlenews) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(idlenews);
	}

	public IdleNews getIdleById(Long id) {
		// TODO Auto-generated method stub
		String hql = "from IdleNews i where i.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<IdleNews> idlenews = query.list();
		if (!idlenews.isEmpty()) {
			return idlenews.get(0);
		}
		return new IdleNews();
	}

	public void update(IdleNews idlenews) {
		// TODO Auto-generated method stub
		String hql = "update IdleNews i set i.title =:title, i.content = :content, i.category.id = :idCat where i.id =:id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("title", idlenews.getTitle());
		query.setParameter("content", idlenews.getContent());
		query.setParameter("idCat", idlenews.getCategory().getId());
		query.setParameter("id", idlenews.getId());
		query.executeUpdate();
	}

	public List<IdleNews> searchByName(String title) {
		// TODO Auto-generated method stub
		String hql = "from IdleNews i where lower(i.title) like lower('%"+title+"%')";
		Session session = sessionFactory.getCurrentSession();
		List<IdleNews> idlenews = session.createQuery(hql).list();
		return idlenews;
	}

	public void publishIdle(Long id) {
		// TODO Auto-generated method stub
		String hql ="update IdleNews i set i.isPublish ='1' where i.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public void deleteIdle(Long id) {
		// TODO Auto-generated method stub
		String hql ="update IdleNews i set i.isDelete ='0' where i.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}
	
	
}
