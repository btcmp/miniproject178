package com.miniproject.training.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MonitoringDaoImpl implements MonitoringDao{

	@Autowired
	SessionFactory sessionFactory;
}