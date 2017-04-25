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

  public Student create(String name, Double gapx, String ambition) {
    return this.studentDao.create(name, gapx, ambition);
  }
}