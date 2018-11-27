package com.miniproject.training.dao;


import java.util.List;

import com.miniproject.training.model.Employee;

public interface EmployeeDao {

	public void save(Employee employee);

	public List<Employee> getAllEmployee();

	public void delete(Employee employee);

	public Employee getEmployeeById(int id);

}
