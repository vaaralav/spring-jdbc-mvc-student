package com.example.student.web;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.student.domain.Student;

@RestController
public class StudentController {

  @RequestMapping("/") 
  public String home() {
    return "home";
  }

  @RequestMapping(value = "/students", method=RequestMethod.GET)
  public String students() {
    return "students";
  }

  @RequestMapping(value = "/api/student", method = RequestMethod.POST)
  public @ResponseBody Student createStudent(
    @RequestParam(value="name", required=true) String name,
    @RequestParam(value="gpax", required=false) Double gpax,
    @RequestParam(value="ambition", required=false) String ambition) {

    return new Student(name, gpax, ambition);
  }

}