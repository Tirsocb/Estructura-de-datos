package com.company;

public class Insert extends Tree {
    public void insert(String key){
        Search search =new Search();
        Node node = raiz;
        if(node.nNodes == 3){
            Node Node = new Node();
            raiz = Node;
            Node.nNodes = 0;
            raiz.leaf = false;
            Node.Child[0] = node;
            search.split(Node, 1, node);
            search.full(Node, key);
        }else{
            search.full(node, key);
        }
    }
}
