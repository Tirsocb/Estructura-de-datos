package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Node USD = new Node("USD");
        Node EUR = new Node("EUR");
        Node Quetzal = new Node("Quetzal");
        Node ARS = new Node("ARS");
        Node ZWD = new Node("ZWD");
        Node CHF = new Node("CHF");
        Node CNY = new Node("CNY");
        Node VES = new Node("VES");
        Node MXN = new Node("MXN");

        USD.addDestination(CNY, 6.71);
        EUR.addDestination(USD,1.12);
        Quetzal.addDestination(USD, 0.13);
        Quetzal.addDestination(VES, 428);
        EUR.addDestination(VES,3694.16);
        ARS.addDestination(MXN, 0.44);
        ZWD.addDestination(MXN,0.05);
        CHF.addDestination(MXN,19.61);
        CHF.addDestination(USD,0.99);
        graph.addNode(USD);
        graph.addNode(EUR);
        graph.addNode(Quetzal);
        graph.addNode(ARS);
        graph.addNode(ZWD);
        graph.addNode(CHF);
        graph.addNode(CNY);
        graph.addNode(VES);
        graph.addNode(MXN);

        graph = Dijkstra.calculateShortestPathFromSource(graph,USD);
        


    }
}
