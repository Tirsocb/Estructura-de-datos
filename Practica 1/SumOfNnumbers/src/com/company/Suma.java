package com.company;

import java.util.Scanner;

public class Suma {
    public static int natural(int n){
        int num= n;
        int count, total = 0;


        System.out.println("Enter the value of n:");

        //quitar esto para hacer tests
        Scanner scan = new Scanner(System.in);

        //quitar esto para hacer tests
        num = scan.nextInt();


        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
        return total;
    }
}
