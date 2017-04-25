package com.example.student.domain;

public class Student {
  private Integer id;
  private String name;
  private Double gapx;
  private String ambition;

  public Student(Integer id, String name, Double gapx, String ambition) {
    this.id = id;
    this.name = name;
    this.gapx = gapx;
    this.ambition = ambition;
  }

  public Integer getId() {
    return this.id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setGAPX(Double gapx) {
    this.gapx = gapx;
  }

  public Double getGAPX() {
    return this.gapx;
  }

  public void setAmbition(String ambition) {
    this.ambition = ambition;
  }

  public String getAmbition() {
    return this.ambition;
  }
}