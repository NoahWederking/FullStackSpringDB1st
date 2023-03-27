package com.example.fullstackspringdb.model;

public class Person {
    private int id;
    private String first_name;
    private String last_name;

    public Person(int id, String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        this.id = id;
    }

    public Person(){

    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
