package com.nitish.poc;

/**
 * Created by Nitish Shukla on 22/9/14.
 */
public class LeafNodeBuilderPattern {
    private  String name;
    private  String salary;

    public String getName() {
        return name;
    }

    public LeafNodeBuilderPattern setName(String name) {
        this.name = name;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public LeafNodeBuilderPattern setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public LeafNode build(){
        LeafNode leafNode = new LeafNode();
        leafNode.setName(getName());
        leafNode.setSalary(getSalary());
        return leafNode;
    }
}
