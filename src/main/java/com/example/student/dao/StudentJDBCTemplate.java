package com.example.student.dao;

import com.example.student.domain.Student;

import java.sql.*;
import java.util.Collection;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("jdbc")
public class StudentJDBCTemplate implements StudentDao {

    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public Collection<Student> getAll() {
        final String SQL = "SELECT * FROM `Student`";
        Collection<Student> students = jdbcTemplateObject.query(
                SQL,
                new Object[]{},
                new StudentMapper()
        );
        return students;
    }

    @Override
    public Student getById(int id) {

        final String SQL = "SELECT * FROM `Student` WHERE `id` = ?";
        Student student = jdbcTemplateObject.queryForObject(
                SQL,
                new Object[]{id},
                new StudentMapper()
        );
        return student;

    }

    @Override
    public void removeById(int id) {
        final String SQL = "DELETE FROM `Student` WHERE `id` = ?";
        jdbcTemplateObject.update(SQL, new Object[]{id});
        return;
    }

    @Override
    public void update(Student student) {
        final String SQL = "UPDATE `Student` SET `name` = ? , `gpax` = ?, `ambition` = ? WHERE `id` = ?";
        jdbcTemplateObject.update(SQL, new Object[]{
                student.getName(),
                student.getGPAX(),
                student.getAmbition(),
                student.getId()
        });
    }

    @Override
    public void insert(final Student student) {
        final String SQL = "INSERT INTO `Student` (`id`, `name`, `gpax`, `ambition`) VALUES (?, ?, ?, ?)";
        jdbcTemplateObject.update(SQL, new Object[]{
                student.getName(),
                student.getGPAX(),
                student.getAmbition()
        });
    }

    @Override
    public void upsert(Integer id, Student student) {
        final String SQL = String.join(" ",
                "INSERT INTO `Student` (`id`, `name`, `gpax`, `ambition`) VALUES (?, ?, ?, ?)",
                "ON DUPLICATE KEY UPDATE `name` = ?, `gpax` = ?, `ambition` = ?;"
        );

        jdbcTemplateObject.update(
                SQL,
                new Object[]{
                        student.getId(),
                        student.getName(),
                        student.getGPAX(),
                        student.getAmbition(),
                        student.getName(),
                        student.getGPAX(),
                        student.getAmbition()
                }
        );
    }

    @Override
    public Student create(final String name, final Double gpax, final String ambition) {
        final String SQL = "INSERT INTO `Student` (`name`, `gpax`, `ambition`) VALUES (?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplateObject.update( new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, name);
                ps.setDouble(2, gpax);
                ps.setString(3, ambition);
                return ps;
            }
        }, keyHolder);

        Student student = new Student(keyHolder.getKey().intValue(), name, gpax, ambition);
        return student;
    }
}
