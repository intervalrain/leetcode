package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n1041_RobotBoundedInCircleTest {
    
    n1041_RobotBoundedInCircle clz = new n1041_RobotBoundedInCircle();
    String instructions;
    boolean expected;
    boolean actual;

    @Test
    public void test1(){
        instructions = "GGLLGG";
        expected = true;
        actual = clz.isRobotBounded(instructions);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        instructions = "GG";
        expected = false;
        actual = clz.isRobotBounded(instructions);
        assertEquals(expected, actual);
    }   

    @Test
    public void test3(){
        instructions = "GL";
        expected = true;
        actual = clz.isRobotBounded(instructions);
        assertEquals(expected, actual);
    }
}
