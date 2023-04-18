package com.teachers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.model.Teacher;
import com.teachers.repository.TeachersRepository;

@Service
public class ServiceTeacherImpl implements IServiceTeacher{


	@Autowired
	private TeachersRepository repository;

	@Override
	public List<Teacher> findAll() {
		return (List<Teacher>) repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		//TO DO
	}
	
	@Override
	public void save(Teacher teacher) {
		//TO DO
	}

}
