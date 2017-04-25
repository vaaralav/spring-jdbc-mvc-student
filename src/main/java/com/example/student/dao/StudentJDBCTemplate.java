package com.example.student.dao;

import com.example.student.domain.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
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
        return null;
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void insert(final Student student) {

    }

    @Override
    public void upsert(Integer id, Student student) {

    }

    @Override
    public Student create(final String name, final Double gpax, final String ambition) {
        final String SQL = "insert into Student (name, gpax, ambition) values (?, ?, ?)";
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

        Student student = new Student((Integer)keyHolder.getKey().intValue(), name, gpax, ambition);
        return student;
    }
}
