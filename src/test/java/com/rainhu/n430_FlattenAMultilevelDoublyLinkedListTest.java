package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.rainhu.DioUtility.TriNode;

import org.junit.jupiter.api.Test;

public class n430_FlattenAMultilevelDoublyLinkedListTest {
    
    n430_FlattenAMultilevelDoublyLinkedList clz = new n430_FlattenAMultilevelDoublyLinkedList();
    Integer[] head;
    Integer[] expected;
    TriNode temp;
    Integer[] actual;

    @Test
    public void test1(){
        head = new Integer[]{1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12};
        temp = clz.flatten(TriNode.toNode(head));
        actual = TriNode.toArray(temp);
        expected = new Integer[]{1,2,3,7,8,11,12,9,10,4,5,6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        head = new Integer[]{1,2,null,3};
        temp = clz.flatten(TriNode.toNode(head));
        actual = TriNode.toArray(temp);
        expected = new Integer[]{1,3,2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        head = new Integer[]{};
        temp = clz.flatten(TriNode.toNode(head));
        actual = TriNode.toArray(temp);
        expected = new Integer[]{};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void test4(){
        head = new Integer[]{1,null,2,null,3};
        temp = clz.flatten(TriNode.toNode(head));
        actual = TriNode.toArray(temp);
        expected = new Integer[]{1,2,3};
        assertArrayEquals(expected, actual);
    }

}
