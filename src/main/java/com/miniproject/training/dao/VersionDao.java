package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Version;

public interface VersionDao {

	public List<Version> getAllVersions();

	public void save(Version version);

	public Version getVersionById(Long id);

}
