package com.bankmega.traning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.OfficeDao;
import com.bankmega.traning.model.Office;

@Service
@Transactional
public class OfficeService {

	@Autowired
	OfficeDao officeDao;
	
	public List<Office> getAllOffices() {
		// TODO Auto-generated method stub
		return officeDao.getAllOffices();
	}

	public void save(Office office) {
		// TODO Auto-generated method stub
		officeDao.save(office);
	}

}
