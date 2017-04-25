package com.example.student.domain;

public class Student {
  private Integer id;
  private String name;
  private Double gpax;
  private String ambition;

  public Student(Integer id, String name, Double gpax, String ambition) {
    this.id = id;
    this.name = name;
    this.gpax = gpax;
    this.ambition = ambition;
  }

  public Student() {}

  public Integer getId() {
    return this.id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setGPAX(Double gpax) {
    this.gpax = gpax;
  }

  public Double getGPAX() {
    return this.gpax;
  }

  public void setAmbition(String ambition) {
    this.ambition = ambition;
  }

  public String getAmbition() {
    return this.ambition;
  }
}