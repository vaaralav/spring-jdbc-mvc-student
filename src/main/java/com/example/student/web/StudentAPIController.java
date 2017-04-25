package com.example.student.web;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.student.domain.Student;
import com.example.student.service.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("/api/student")
public class StudentAPIController {

  @Autowired
  private StudentService studentService;

  @RequestMapping(method=RequestMethod.GET)
  public Collection<Student> getAllStudents() {
    return studentService.getAll();
  }

  @RequestMapping(method = RequestMethod.POST)
  public @ResponseBody Student createStudent(
    @RequestBody Student student) {
    return studentService.create(
            student.getName(),
            student.getGPAX(),
            student.getAmbition()
    );
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public @ResponseBody Student getStudentById(@PathVariable("id") int id) {
    return studentService.getById(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public @ResponseBody void removeStudentById(@PathVariable("id") int id) {
    studentService.removeById(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public @ResponseBody Student upsertStudent(@PathVariable("id") int id, @RequestBody Student student) {

    // TODO: Should return error instead
    if (id != student.getId()) {
      return null;
    }

    return studentService.upsert(id, student);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
  public @ResponseBody Student patchStudent(@PathVariable("id") int id, @RequestBody Student update) {
    Student student = studentService.getById(id);

    if (update.getName() != null) {
      student.setName(update.getName());
    }

    if (update.getGPAX() != null) {
      student.setGPAX(update.getGPAX());
    }

    if (update.getAmbition() != null) {
      student.setAmbition(update.getAmbition());
    }

    // TODO: Should return error instead
    // Handle this last so every other attribute is already updated locally
    if (update.getId() != null) {
      return studentService.upsert(id, new Student(
        update.getId(), student.getName(), student.getGPAX(), student.getAmbition()
      ));
    }

    studentService.update(student);
    return student;
  }

}