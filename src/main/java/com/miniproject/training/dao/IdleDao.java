package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.IdleNews;

public interface IdleDao {

	List<IdleNews> getAllIdlenews();

	void save(IdleNews idlenews);

	IdleNews getIdleById(Long id);

	void update(IdleNews idlenews);

	List<IdleNews> searchByName(String title);

	void publishIdle(Long id);

	void deleteIdle(Long id);

}
