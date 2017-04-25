package com.example.student.dao;

import com.example.student.domain.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fake")
public class FakeStudentDaoImpl implements StudentDao {
  private static Map<Integer, Student> students;
  private static Integer counter;

  static {
    students = new HashMap<Integer, Student>(){};
    counter = 0;
  }

  @Override
  public void setDataSource(DataSource ds) {

  }

  @Override
  public Collection<Student> getAll() {
    return this.students.values();
  }

  @Override
  public Student getById(int id) {
    return this.students.get(id);
  }

  @Override
  public void removeById(int id) {
    this.students.remove(id);
  }

  @Override
  public void update(Student student) {
    Student s = students.get(student.getId());
    s.setName(student.getName());
    s.setGPAX(student.getGPAX());
    s.setAmbition(student.getAmbition());
    students.put(s.getId(), s);
  }

  @Override
  public void insert(Student student) {
    System.out.println(student.getId());
    this.students.put(student.getId(), student);
  }

  @Override
  public void upsert(Integer id, Student update) {
    Student student = students.get(id);
    if (student != null) {
      this.update(student);
    } else {
      students.put(update.getId(), update);
    }
  }

  @Override
  public Student create(String name, Double gpax, String ambition) {
    Student student = new Student(
      ++this.counter,
      name,
      gpax,
      ambition
    );

    insert(student);

    return student;
  }
}