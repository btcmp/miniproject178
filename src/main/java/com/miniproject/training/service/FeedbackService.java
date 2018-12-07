package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.FeedbackDao;
import com.miniproject.training.model.Feedback;

@Service
@Transactional
public class FeedbackService {
	
	@Autowired
	FeedbackDao feedbackDao;

	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return feedbackDao.getAllFeedbacks();
	}

	public void saving(Feedback feedback) {
		// TODO Auto-generated method stub
		feedbackDao.save(feedback);
	}

}