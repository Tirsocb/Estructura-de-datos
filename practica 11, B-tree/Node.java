package com.company;

public class Node {
    int nNodes;
    String value[];
    boolean leaf;
    Node Child[];
    Node(){
        Child=new Node[4];
        value = new String[3];
        leaf=true;

    }

}

