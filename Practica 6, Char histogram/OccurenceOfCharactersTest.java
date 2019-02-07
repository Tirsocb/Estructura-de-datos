package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class OccurenceOfCharactersTest {

    @Test
    public void ex() {
        OccurenceOfCharacters prueba= new OccurenceOfCharacters();
        String test ="aaa";
        int result= prueba.ex(test);
        Assert.assertEquals(3, result);

    }
}