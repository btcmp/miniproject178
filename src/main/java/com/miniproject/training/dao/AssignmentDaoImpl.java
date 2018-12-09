package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Assignment;

@Repository
public class AssignmentDaoImpl implements AssignmentDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<Assignment> getAllAssignments() {
		// TODO Auto-generated method stub
		String hql="from Assignment a where a.isDone='0' and a.isHold='0' and a.isDelete='0'";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		List<Assignment> assignments=query.list();
		if (!assignments.isEmpty()) {
			return assignments;
		}
		return new ArrayList();
	}

	public void save(Assignment assignment) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(assignment);
	}

	public Assignment getAssignmentById(Long id) {
		// TODO Auto-generated method stub
		String hql="from Assignment a where a.id= :id";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setParameter("id", id);
		List<Assignment> assignments=query.list();
		if (!assignments.isEmpty()) {
			return assignments.get(0);
		}
		return new Assignment();
	}

	public List<Assignment> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql="from Assignment a where a.isDone='0' and a.isHold='0' and a.isDelete='0' and lower(a.testId.name) like lower('%"+name+"%')";
		Session session=sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		//query.setParameter("name", name);
		List<Assignment> assigments = query.list();
		if(assigments.isEmpty()) {
			return new ArrayList();
		}
		return assigments;
	}
}
