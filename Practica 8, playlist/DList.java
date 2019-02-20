package com.company;


public class DList {
    Node head;

    class Node {
        String datos;
        Node prev;
        Node next;

        Node(String d) { datos = d; }
    }

    public void Insertar(String new_data)
    {

        Node new_Node = new Node(new_data);


        new_Node.next = head;
        new_Node.prev = null;


        if (head != null)
            head.prev = new_Node;


        head = new_Node;
    }

    public void printlist(Node node)
    {
        Node last = null;

        while (node != null) {
            System.out.print(node.datos + " ");
            last = node;
            node = node.next;
        }
        System.out.println();

    }
}
