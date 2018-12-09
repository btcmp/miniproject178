package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Monitoring;

public interface MonitoringDao {

	List<Monitoring> getAllMonitorings();

	void save(Monitoring monitoring);

	Monitoring getMonitoringById(Long id);

	List<Monitoring> getSearchByName(String name);

}
