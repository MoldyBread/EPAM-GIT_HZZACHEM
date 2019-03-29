package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleApplicationTest {

    @Test
    public void shouldReturnSUm(){
        int actual = ConsoleApplication.sum(1,2);
        assertEquals(3,actual);
    }
}