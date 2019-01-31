package com.company;

import java.util.Arrays;

public class Operation {

    CreditsyDebits creditsyDebits= new CreditsyDebits();

    public double suma(double num[]){
        int a=0;
       for( int i=0; i<num.length; i++){
           a+=num[i];
       }

       return a;
    }

    public double saldo( double c, double d, double result){
        result= c-d;

        return result;
    }

    public double promedio(double num[]){

        double div=0;
        double total=num.length;

        for(int a=0; a<num.length; a++){
            num[a]=+div;
        }
        double promedio= div/total;
        return promedio;
    }

    public double maxDeb(double num[]){
        double max = num[0];
        for(int i = 1; i < num.length;i++)
        {
            if(num[i] > max)
            {
                max = num[i];
            }
        }
        return max;
    }

    public void Operaciones(double credits[], double debits[]){
    int counterCredits=0;
    int counterDebits=0;
    for(int a=0; a<credits.length; a++)
    {
        if(credits[a]!=0){
            counterCredits++;
        }
    }

    for(int b=0; b<debits.length; b++){

        if(debits[b]!=0){
            counterDebits++;
        }
    }

    System.out.println("Numero de operaciones en Creditos: "+ counterCredits);
    System.out.println("Numero de operaciones en Debitos: "+ counterDebits);
    }



    public void showArrays(double credits[],double debits[]){
        System.out.println(Arrays.toString(credits));
        System.out.println(Arrays.toString(debits));


    }

    public void eliminar(int e, double arr[] ){
        int i=-1;
        double[] newArr= new double[10];
        for(int a=0; a<arr.length;a++)
        {
            if(arr[a] != e){
                newArr[i++]=arr[a];
            }
        }

        arr=newArr;

    }
}
