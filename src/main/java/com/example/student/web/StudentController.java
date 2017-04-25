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

}