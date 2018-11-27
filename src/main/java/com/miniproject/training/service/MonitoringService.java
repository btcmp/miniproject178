package com.miniproject.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.MonitoringDao;

@Service
@Transactional
public class MonitoringService {

	@Autowired
	MonitoringDao monitoringDao;
}
