package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    System.out.println("foobarfoobarfoobar");
    SpringApplication.run(Application.class, args);
  }
}