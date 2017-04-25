package com.example.student.dao;

import com.example.student.domain.Student;

import java.util.Collection;
import javax.sql.DataSource;

public interface StudentDao {

  void setDataSource(DataSource ds);

  Collection<Student> getAll();

  Student getById(int id);

  void removeById(int id);

  void update(Student student);

  void insert(Student student);

  void upsert(Integer id, Student student);

  Student create(String name, Double gpax, String ambition);

}