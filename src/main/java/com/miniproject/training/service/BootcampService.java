package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.BootcampDao;
import com.miniproject.training.model.Bootcamp;

@Service
@Transactional
public class BootcampService {

	@Autowired
	BootcampDao bootcampDao;
	
	public List<Bootcamp> getAllBootcamps() {
		// TODO Auto-generated method stub
		return bootcampDao.getAllBootcamps();
	}

	public void save(Bootcamp bootcamp) {
		// TODO Auto-generated method stub
		bootcampDao.save(bootcamp);
	}

}
