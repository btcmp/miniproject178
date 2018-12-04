package com.miniproject.training.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.MonitoringDao;
import com.miniproject.training.model.Monitoring;


@Service
@Transactional
public class MonitoringService {

	@Autowired
	MonitoringDao monitoringDao;

	public List<Monitoring> getAllMonitorings() {
		// TODO Auto-generated method stub
		return monitoringDao.getAllMonitorings();
	}

	public void save(Monitoring monitoring) {
		// TODO Auto-generated method stub
		monitoringDao.save(monitoring);
	}

}
