package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Department;
import com.miniproject.training.model.Employee;

public interface DepartmentDao {

	List<Department> getAllDepartments();

	Department getDepartmentById(int id);

	void save(Department department);

	void delete(int id);

}
