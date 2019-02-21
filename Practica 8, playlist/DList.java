package com.company;



public class DList {
    Node head;
    Node tail;

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


        while (node != null) {
            System.out.print(node.datos + " ");

            node = node.next;
        }
        System.out.println();

    }

    public void PlayNow(Node node){
        System.out.println("Playing current song: " + node.datos);

    }

    public void PlayNext(Node node){
        node = node.next;
        System.out.println("Playing next song:" + node.datos);
        head = node.next;




    }

    public void PlayPrevious(Node node) {
        head = node.prev;
        node= node.prev;
        System.out.println("Playing previous song: "+ node.datos);


        }

}
