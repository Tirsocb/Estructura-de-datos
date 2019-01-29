package com.company;


import org.junit.Assert;
import org.junit.Test;

public class MethodsTest {
Methods prueba= new Methods();



    @Test
    public void pop() {
       prueba.StackArray();
        prueba.push(1);
        prueba.push(6);
        long result =prueba.pop();
        Assert.assertEquals(6,result);

    }

    @Test
    public void push() {
        prueba.StackArray();
        prueba.push(1);
        boolean resultado= prueba.vacio();
        Assert.assertFalse(resultado);

    }

    @Test
    public void clear() {
prueba.StackArray();
prueba.push(1);
prueba.clear();
boolean result = prueba.vacio();
        Assert.assertTrue(result);

    }

    @Test
    public void vacio() {
        prueba.StackArray();
        boolean result =prueba.vacio();
        Assert.assertTrue(result);



    }
}