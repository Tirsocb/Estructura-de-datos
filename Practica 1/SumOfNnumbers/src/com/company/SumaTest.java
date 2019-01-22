package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest {
    Suma examen= new Suma();
// Para hacer pruebas, remover "scanner" de la clase Suma
    @Test
    public void test1() {
        final int esperado=3;
        final int actual=examen.natural(2);
        Assert.assertEquals(esperado,actual);

    }

    @Test
    public void test3(){
        final int esperado=500500;
        final int actual=examen.natural(1000);
        Assert.assertEquals(esperado, actual);
    }
}