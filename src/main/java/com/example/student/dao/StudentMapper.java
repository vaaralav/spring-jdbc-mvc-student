package com.example.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.student.domain.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNumber) throws SQLException {
        return new Student(
                rs.getInt(Student.STUDENT_ID),
                rs.getString(Student.STUDENT_NAME),
                rs.getDouble(Student.STUDENT_GPAX),
                rs.getString(Student.STUDENT_AMBITION)
        );
    }
}