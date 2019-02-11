package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AreasTest extends Shapes {

    @Test
    public void circle() {
        Areas test = new Areas();
        double result = test.Circle(1);
        Assert.assertEquals(3.14, result,0.5);
    }

    @Test
    public void rectangle() {
        Areas test = new Areas();
        double result = test.Rectangle(1,1);
        Assert.assertEquals(1,result,0.5);
    }

    @Test
    public void triangle() {
        Areas test = new Areas();
        double result = test.Triangle(1,2);
        Assert.assertEquals(1,result,0.5);
    }

}