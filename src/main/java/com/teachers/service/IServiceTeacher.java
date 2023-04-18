package com.teachers.service;

import java.util.List;

import com.teachers.model.Teacher;



public interface IServiceTeacher {

	public List<Teacher> findAll();
	public void deleteById(Long id);
	public void save(Teacher teacher);
}
