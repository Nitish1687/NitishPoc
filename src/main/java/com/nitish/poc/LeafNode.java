package com.nitish.poc;

public class LeafNode extends Node{

    private String name;
    private String salary;

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
