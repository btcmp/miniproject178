package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.VersionDao;
import com.miniproject.training.model.Version;

@Service
@Transactional
public class VersionService {

	@Autowired
	VersionDao versionDao;

	public List<Version> getAllVersions() {
		// TODO Auto-generated method stub
		return versionDao.getAllVersions();
	}

	public void saving(Version version) {
		// TODO Auto-generated method stub
		versionDao.save(version);
	}

	public Version getVersionById(Long id) {
		// TODO Auto-generated method stub
		Version version = versionDao.getVersionById(id);
		return version;
	}
	
}