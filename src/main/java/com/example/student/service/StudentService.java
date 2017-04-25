package com.example.student.service;

import com.example.student.dao.StudentDao;
import com.example.student.domain.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
  @Autowired
  @Qualifier("fake")
  private StudentDao studentDao;

  public Collection<Student> getAll() {
    return this.studentDao.getAll();
  }

  public Student create(String name, Double gpax, String ambition) {
    return this.studentDao.create(name, gpax, ambition);
  }

  public Student insert(Student student) {
    this.studentDao.insert(student);
    return student;
  }

  public Student upsert(Integer id, Student student) {
    this.studentDao.upsert(id, student);
    return student;
  }

  public Student getById(int id) {
    return this.studentDao.getById(id);
  }

  public void removeById(int id) {
    this.studentDao.removeById(id);
  }

  public Student update(Student student) {
    this.studentDao.update(student);
    return student;
  }
}