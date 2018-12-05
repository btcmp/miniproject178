package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Feedback;

@Repository
public class FeedbackDaoImpl implements FeedbackDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		String hql = "from Feedback";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Feedback> feedbacks = query.list();
		if (!feedbacks.isEmpty()) {
			return feedbacks;
		}
		return new ArrayList();
	}

	public void save(Feedback feedback) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(feedback);
	}

}