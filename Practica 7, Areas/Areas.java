package com.company;

public class Areas extends Shapes {

    public double Circle(double radio)
    {
        radius=radio;
        double area= 3.14*radius*radius;
        return area;
    }

    public double Rectangle(double h, double w){
        height=h;
        width=w;
        double area = height*width;
        return area;
    }

    public double Triangle(double b, double h){
        base=b;
        height=h;
        double area=(base * height)/2;
        return area;
    }

}
