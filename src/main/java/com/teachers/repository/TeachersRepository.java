package com.teachers.repository;

import org.springframework.data.repository.CrudRepository;

import com.teachers.model.Teacher;

public interface TeachersRepository extends CrudRepository<Teacher, Long>{

}
