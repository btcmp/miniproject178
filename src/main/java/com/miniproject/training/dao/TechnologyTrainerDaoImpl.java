package com.miniproject.training.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Technology;
import com.miniproject.training.model.TechnologyTrainer;
import com.miniproject.training.model.Trainer;

@Repository
public class TechnologyTrainerDaoImpl implements TechnologyTrainerDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public List<TechnologyTrainer> getAll() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		List<TechnologyTrainer> technologyTrainer=session.createCriteria(TechnologyTrainer.class).list();
		return technologyTrainer;
	}
	public void save(TechnologyTrainer technologyTrainer) {
		// TODO Auto-generated method stub
		technologyTrainer.setCreatedOn(new Date());
		Session session=sessionFactory.getCurrentSession();
		session.save(technologyTrainer);
		
	}

}
