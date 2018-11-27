package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.Question;

public interface QuestionDao {

	public List<Question> getAllQuestions();

	public void save(Question question);

}