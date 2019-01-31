package com.company;

import java.util.Scanner;

public class CreditsyDebits {

    double[] credtis =new double[10];
    double[] debits= new double[10];

    public void ingresar(double num[]){

      for(int a=0; a<num.length; a++){
          Scanner sc = new Scanner(System.in);
          num[a]=sc.nextDouble();
      }


    }





}
