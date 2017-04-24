package com.example.student.domain;

public class Student {
  private String name;
  private Double gapx;
  private String ambition;

  public Student(String name, Double gapx, String ambition) {
    this.name = name;
    this.gapx = gapx;
    this.ambition = ambition;
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