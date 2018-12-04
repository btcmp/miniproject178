package com.miniproject.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.VersionDetailDao;
import com.miniproject.training.model.VersionDetail;

@Service
@Transactional
public class VersionDetailService {

	@Autowired
	VersionDetailDao versionDetailDao;

	public void saving(VersionDetail versionDetail) {
		// TODO Auto-generated method stub
		
	}
	
}
