package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n138_CopyListWithRandomPointerTest {
    
    n138_CopyListWithRandomPointer clz = new n138_CopyListWithRandomPointer();
    Node head;
    Node expected, actual;

    @Test
    public void test1(){
        Node[] node = new Node[5];
        node[0] = new Node(7);
        node[1] = new Node(13);
        node[2] = new Node(11);
        node[3] = new Node(10);
        node[4] = new Node(1);
        node[0].random = null;
        node[1].random = node[0];
        node[2].random = node[4];
        node[3].random = node[2];
        node[4].random = node[0];
        for (int i = 1; i < 5; i++){
            node[i-1].next = node[i];
        }
        head = node[0];
        expected = head;
        actual = clz.copyRandomList(head);
        for (int i = 0; i < 5; i++){
            assertEquals(expected.val, actual.val);
            if (expected.random != null && actual.random != null)
                assertEquals(expected.random.val, actual.random.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void test2(){
        Node[] node = new Node[2];
        node[0] = new Node(1);
        node[1] = new Node(2);
        node[0].random = node[1];
        node[1].random = node[1];
        for (int i = 1; i < 2; i++){
            node[i-1].next = node[i];
        }
        head = node[0];
        expected = head;
        actual = clz.copyRandomList(head);
        for (int i = 0; i < 2; i++){
            assertEquals(expected.val, actual.val);
            if (expected.random != null && actual.random != null)
                assertEquals(expected.random.val, actual.random.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void test3(){
        Node[] node = new Node[3];
        node[0] = new Node(3);
        node[1] = new Node(3);
        node[2] = new Node(3);
        node[1].random = null;
        for (int i = 1; i < 3; i++){
            node[i-1].next = node[i];
        }
        head = node[0];
        expected = head;
        actual = clz.copyRandomList(head);
        for (int i = 0; i < 3; i++){
            assertEquals(expected.val, actual.val);
            if (expected.random != null && actual.random != null)
                assertEquals(expected.random.val, actual.random.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
