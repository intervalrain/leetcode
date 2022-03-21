package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n763_PartitionLabelsTest {
    
    n763_PartitionLabels clz = new n763_PartitionLabels();
    String s;
    List<Integer> expected, actual;

    @Test
    public void test1(){
        s = "ababcbacadefegdehijhklij";
        expected = List.of(9,7,8);
        actual = clz.partitionLabels(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        s = "eccbbbbdec";
        expected = List.of(10);
        actual = clz.partitionLabels(s);
        assertEquals(expected, actual);
    }
}
