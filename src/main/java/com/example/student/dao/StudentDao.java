package com.example.student.dao;

import com.example.student.domain.Student;

import java.util.Collection;

public interface StudentDao {

  Collection<Student> getAll();

  Student getById(int id);

  void removeById(int id);

  void update(Student student);

  void insert(Student student);

  Student create(String name, Double gapx, String ambition);

}