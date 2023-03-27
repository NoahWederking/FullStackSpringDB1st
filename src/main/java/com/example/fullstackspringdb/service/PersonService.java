package com.example.fullstackspringdb.service;

import com.example.fullstackspringdb.model.Person;
import com.example.fullstackspringdb.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    PersonRepo personRepo;

    public List<Person> fetchAll(){
        //Her skal Sql kode stå
        return personRepo.fetchAll();
    }

    public void addPerson(Person p){
        personRepo.addPerson(p);
    }

    public Person findPersonById(int id){
        return personRepo.findPersonById(id);
    }

    public Boolean delete(int id){
        return personRepo.deletePerson(id);
    }

    public void updatePerson(int id, Person p){
        personRepo.updatePerson(id, p);
    }

}
