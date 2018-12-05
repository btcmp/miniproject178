package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.QuestionDao;
import com.miniproject.training.model.Question;

@Service
@Transactional
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDao.getAllQuestions();
	}

	public void saving(Question question) {
		// TODO Auto-generated method stub
		questionDao.save(question);
	}

	public Question getQuestionById(Long id) {
		// TODO Auto-generated method stub
		Question question = questionDao.getQuestionById(id);
		return question;
	}

}