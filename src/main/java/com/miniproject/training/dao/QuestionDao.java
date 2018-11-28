package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Question;

public interface QuestionDao {

	public List<Question> getAllQuestions();

	public void save(Question question);

	public void delete(Long id);

}