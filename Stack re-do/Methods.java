package com.company;

public class Methods {

    private int[] Stack;
    private int pointer;
    private int counter=0;

    public void StackArray(){
        Stack= new int[1000000000];
        pointer=0;
    }


    public int pop(){
        if(pointer==-1){
            System.out.println("StackEmptyException");
        }else counter--;
        return Stack[pointer--];

    }


    public void push(int num){

        if(pointer==Stack.length-1){
            System.out.println("StackFullException");
        }
        else
        {
            Stack[++pointer]=num;
            counter++;
        }

    }

    public int clear(){

        if(pointer==-1)
        {
            System.out.println("Stack is already empty");
        }else{
            for(int i=0;i<counter;i++){
                Stack[pointer--]= 0;
            }
            pointer=-1;
        }
        return Stack[++pointer];
    }

    public boolean vacio()
    {
        return (pointer ==0)? true : false;
    }
}
