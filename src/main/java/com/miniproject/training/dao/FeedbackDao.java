package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Feedback;

public interface FeedbackDao {

	public List<Feedback> getAllFeedbacks();

	public void save(Feedback feedback);

}