package com.nitish.poc;

import a.j.re;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nitish Shukla on 22/9/14.
 */
public class SubNode extends Node{

    private String name;
    private String salary;
    private List<Node> nodes = new ArrayList<Node>();

    public void printAllSubNodes(){
        System.out.print("----SubNode Name : " + name + "---- SubNode Salary" + salary);
        for (Node node : nodes) {
            System.out.print("----NAME : " + node.getName() + "----- SALARY : " + node.getSalary());
            if (node.getNodes() != null) {
                for (Node tempNode : node.getNodes()) {
                    System.out.print("----NAME : " + tempNode.getName() + "----- SALARY : " + tempNode.getSalary());
                }
            }
        }
    }



    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public SubNode setName(String name) {
        this.name=name;
        return this;
    }

    public SubNode setSalary(String salary) {
        this.salary=salary;
        return this;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
