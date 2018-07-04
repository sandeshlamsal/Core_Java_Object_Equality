package com.san.model;

import java.util.Objects;

public class Employee {

    //define id and name as instance variable
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //generate getter and setter fro the Employee model
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    /*
    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
    */
}
