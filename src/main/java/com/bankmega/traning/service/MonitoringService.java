package com.bankmega.traning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.MonitoringDao;

@Service
@Transactional
public class MonitoringService {

	@Autowired
	MonitoringDao monitoringDao;
}
