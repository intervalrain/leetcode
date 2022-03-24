package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n881_BoatsToSavePeopleTest {
    
    n881_BoatsToSavePeople clz = new n881_BoatsToSavePeople();
    int[] people;
    int limit;
    int expected, actual;

    @Test
    public void test1(){
        people = new int[]{1,2};
        limit = 3;
        expected = 1;
        actual = clz.numRescueBoats(people, limit);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        people = new int[]{3,2,2,1};
        limit = 3;
        expected = 3;
        actual = clz.numRescueBoats(people, limit);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        people = new int[]{3,5,3,4};
        limit = 5;
        expected = 4;
        actual = clz.numRescueBoats(people, limit);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        people = new int[]{7,6,5,5,4,3,2,1,1,1,1,1,1,1};
        limit = 8;   
        expected = 7;
        actual = clz.numRescueBoats(people, limit);
        assertEquals(expected, actual);
    }
}
