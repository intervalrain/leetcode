package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n461_HammingDistanceTest {

        n461_HammingDistance clz = new n461_HammingDistance();
        int x;
        int y;
        int expected;
        int actual;

        @Test
        public void test1(){
            x = 1;
            y = 4;
            expected = 2;
            actual = clz.hammingDistance(x, y);
            assertEquals(expected, actual);
        }

        @Test
        public void test2(){
            x = 3;
            y = 1;
            expected = 1;
            actual = clz.hammingDistance(x, y);
            assertEquals(expected, actual);
        }

}
