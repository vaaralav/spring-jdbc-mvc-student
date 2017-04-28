package com.example.student.web;

import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.student.domain.Student;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

// TODO: Use some layouts / templates for .jsp, maybe Tiles???

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;

  @Value("${application.message:Hello World}")
  private String message = "Hello World";

  @GetMapping("/")
  public ModelAndView index(Map<String, Object> model) {
    model.put("pageTitle", "Ville Vaarala's JDBCTempate Project");
    return new ModelAndView("index", model);
  }

  @GetMapping("/students")
  public ModelAndView listStudents(Map<String, Object> model) {
    model.put("pageTitle", "Students List");
    Collection<Student> students = studentService.getAll();
    model.put("students", students);
    return new ModelAndView("students");
  }

  @GetMapping("/create-student")
  public ModelAndView createStudent(Map<String, Object> model) {
    model.put("pageTitle", "Add New Student");
    return new ModelAndView("createStudent");
  }

  @GetMapping("/edit-student/{id}")
  public ModelAndView editStudent(Map<String, Object> model, @PathVariable("id") Integer id) {
    Student student = studentService.getById(id);

    model.put("pageTitle", "Edit Student");
    model.put("student", student);
    return new ModelAndView("editStudent");
  }
}