package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.Biodata;

public interface BiodataDao {

	List<Biodata> getAllBiodatas();

	void save(Biodata biodata);

}
