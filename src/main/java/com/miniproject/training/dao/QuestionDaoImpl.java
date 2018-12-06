package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.Date;
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
		String hql = "from Question where isDelete = '0'";
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
		session.saveOrUpdate(question);
	}

	public Question getQuestionById(Long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Question q where q.id = :data";
		List<Question> questions = session.createQuery(hql).setParameter("data", id).list();
		if (questions.isEmpty()) {
			return null;
		}
		return questions.get(0);
	}

	public List<Question> searchQuestion(String search) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Question q where q.isDelete = '0' AND lower(q.question) like :search";
		List<Question> questions = session.createQuery(hql).setParameter("search", "%"+search.toLowerCase()+"%").list();
		return questions;
	}

	public List<Question> getLastVersionQuestions() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "select q from Question q inner join (select qq.question from versiondetail qq where qq.version = (select max(qqq.version) from versiondetail qqq) a on qq.question = q.id)";
		Query query = session.createQuery(hql);
		List<Question> questions = query.list();
		if (!questions.isEmpty()) {
			return questions;
		}
		return new ArrayList();
	}

}