package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.BiodataDao;
import com.miniproject.training.model.Biodata;

@Service
@Transactional
public class BiodataService {

	@Autowired
	BiodataDao biodataDao;
	
	public List<Biodata> getAllBiodatas() {
		// TODO Auto-generated method stub
		return biodataDao.getAllBiodatas();
	}

	public void save(Biodata biodata) {
		// TODO Auto-generated method stub
		biodataDao.save(biodata);
	}

}
