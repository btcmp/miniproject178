package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Biodata;

public interface BiodataDao {

	List<Biodata> getAllBiodatas();

	void save(Biodata biodata);

	Biodata getBiodataById(Long id);

}
