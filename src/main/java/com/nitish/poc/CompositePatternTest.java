package com.nitish.poc;

import org.jdesktop.swingx.MultiSplitLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nitish Shukla on 22/9/14.
 */
public class CompositePatternTest {

    public static void main(String [] args){



        LeafNode chunmun = new LeafNodeBuilderPattern().setName("Chunmun").setSalary("0k").build();
        List<Node> monisFamily = new ArrayList<Node>();
        monisFamily.add(chunmun);

        LeafNode neelu = new LeafNodeBuilderPattern().setName("Neelu").setSalary("0k").build();
        LeafNode nitish = new LeafNodeBuilderPattern().setName("Sheelu").setSalary("40k").build();
        SubNode moni = new SubNodeBuilderPattern().setName("Moni").setSalary("0k").setNodes(monisFamily).build();

        List<Node> allChildNodes = new ArrayList<Node>();
        allChildNodes.add(neelu);
        allChildNodes.add(nitish);
        allChildNodes.add(moni);

        SubNode subNode = new SubNodeBuilderPattern().setName("Vijay").setSalary("10k").setNodes(allChildNodes).build();
        subNode.printAllSubNodes();
    }


}
