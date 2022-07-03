package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.rainhu.util.ListTest;

import org.junit.jupiter.api.Test;

public class n1192_CriticalConnectionsInANetworkTest {
 
    n1192_CriticalConnectionsInANetwork clz = new n1192_CriticalConnectionsInANetwork();
    int n;
    List<List<Integer>> connections;
    List<List<Integer>> expected, actual;

    @Test
    public void test1(){
        n = 4;
        connections = Arrays.asList(Arrays.asList(0,1),Arrays.asList(1,2),Arrays.asList(2,0),Arrays.asList(1,3));
        expected = Arrays.asList(Arrays.asList(1,3));
        actual = clz.criticalConnections(n, connections);
        assertTrue(ListTest.intEquals(expected, actual));
    }

    @Test
    public void test2(){
        n = 2;
        connections = Arrays.asList(Arrays.asList(0,1));
        expected = Arrays.asList(Arrays.asList(0,1));
        actual = clz.criticalConnections(n, connections);
        assertTrue(ListTest.intEquals(expected, actual));
    }
}
