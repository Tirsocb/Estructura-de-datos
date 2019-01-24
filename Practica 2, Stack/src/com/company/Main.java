package com.company;
import java.util.Scanner;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        Stack<String> stack1=new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n =0;
        int counter=0;


        while(n !=4)
        {
            System.out.println("1. push 2. pop 3. clear 4. salir");
            n =Integer.parseInt(sc.nextLine());

            switch (n)
            {
                case 1:
                    System.out.println("push");
                    System.out.println("ingrese el valor que desea agregar");
                    Scanner str= new Scanner(System.in);
                    stack1.push(str.nextLine());
                    System.out.println("Estado actuak Stack=> "+ stack1);
                    counter++;

                    break;
                case 2:
                    System.out.println("pop");
                    String pop= stack1.pop();
                    System.out.println("este valor salio "+ pop);
                    System.out.println("Estado actual Stack=>"+ stack1);
                    counter--;
                    break;
                case 3:
                    System.out.println("clear");
                    for(int i=0; i<counter; i++)
                    {
                       String out =stack1.pop();
                        System.out.println("este valor salio "+ out);
                    }
                    System.out.println("Estado actual Stack=> "+ stack1);
                    break;
                case 4:
                    System.out.println("Adios");
                    System.exit(0);

            }

        }





    }
}
