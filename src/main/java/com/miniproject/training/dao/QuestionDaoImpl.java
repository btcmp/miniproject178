package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Question;

@Repository
public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		String hql = "from Question";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Question> questions = query.list();
		if (!questions.isEmpty()) {
			return questions;
		}
		return new ArrayList();
	}

	public void save(Question question) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(question);
	}

}