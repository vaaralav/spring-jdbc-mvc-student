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
    @RequestParam(value="name", required=false) String name,
    @RequestParam(value="gpax", required=false) Double gpax,
    @RequestParam(value="ambition", required=false) String ambition) {
    return studentService.create(name, gpax, ambition);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public @ResponseBody Student getStudentById(@PathVariable("id") int id) {
    return studentService.getById(id);
  }

}