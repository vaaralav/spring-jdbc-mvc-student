package com.example.student.domain;

public class Student {
  private Integer id;
  private String name;
  private Double gpax;
  private String ambition;

  public static final String STUDENT_ID = "id";
  public static final String STUDENT_NAME = "name";
  public static final String STUDENT_GPAX = "gpax";
  public static final String STUDENT_AMBITION = "ambition";

  public Student(Integer id, String name, Double gpax, String ambition) {
    this.id = id;
    this.name = name;
    this.gpax = gpax;
    this.ambition = ambition;
  }

  public Student() {}

  public void setId(Integer id) {
    this.id = id;
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

  public String toString() {
    final Integer id = this.getId();
    final Double gpax = this.getGPAX();

    return String.join("\n",
            "-------- STUDENT --------",
            "id: " + (id != null ? id.toString() : null),
            "name: " + this.getName(),
            "gpax: " + (gpax != null ? gpax.toString() : null),
            "ambition: " + this.getAmbition()
    );
  }
}