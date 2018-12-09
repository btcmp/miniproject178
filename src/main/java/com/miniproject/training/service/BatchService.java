package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.BatchDao;
import com.miniproject.training.model.Batch;

@Service
@Transactional
public class BatchService {
	
	@Autowired
	BatchDao batchDao;
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		return batchDao.getAllBatch();
	}
	public void save(Batch batch) {
		// TODO Auto-generated method stub
		batchDao.save(batch);
	}

}
