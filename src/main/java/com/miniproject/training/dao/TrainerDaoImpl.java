package com.miniproject.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Trainer;

@Repository
public class TrainerDaoImpl implements TrainerDao{

	@Autowired
	SessionFactory sessionFactory;
	public List<Trainer> getAllTrainer() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Trainer>trainer=session.createCriteria(Trainer.class).list();
		return trainer;
	}
	public void save(Trainer trainer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(trainer);
	}

}
