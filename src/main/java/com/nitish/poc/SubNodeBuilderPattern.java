package com.nitish.poc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nitish Shukla on 22/9/14.
 */
public class SubNodeBuilderPattern {
    private String name;
    private String salary;
    private List<Node> nodes = new ArrayList<Node>();

    public String getName() {
        return name;
    }

    public SubNodeBuilderPattern setName(String name) {
        this.name = name;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public SubNodeBuilderPattern setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public SubNodeBuilderPattern setNodes(List<Node> nodes) {
        this.nodes = nodes;
        return  this;
    }

    public SubNode build(){
        SubNode subNode = new SubNode();
        subNode.setSalary(getSalary());
        subNode.setName(getName());
        subNode.setNodes(getNodes());
        return  subNode;
    }
}
