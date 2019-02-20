package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DList n = new DList();
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String s= sc.nextLine();

            n.Insertar(s);
        }
n.printlist(n.head);



    }
}
