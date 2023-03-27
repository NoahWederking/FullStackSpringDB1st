package com.example.fullstackspringdb.repository;

import com.example.fullstackspringdb.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate template;
    public List<Person> fetchAll(){
        //Her skal Sql kode stå
        String sql = "SELECT * FROM person";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
       return template.query(sql, rowMapper);
    }

    public void addPerson(Person p){
        String sql = "INSERT INTO person (id, first_name, last_name) VALUES (?, ?, ?)";
        template.update(sql,p.getId(), p.getFirst_name(), p.getLast_name());

    }

    public Person findPersonById(int id){
        return null;
    }

    public Boolean deletePerson(int id){
        return null;
    }

    public void updatePerson(int id, Person p){

    }
}
