package com.miniproject.training.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Room;

@Repository
public class RoomDaoImpl implements RoomDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Room room) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(room);
	}

}
