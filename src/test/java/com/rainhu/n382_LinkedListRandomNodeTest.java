package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import com.rainhu.DioUtility.ListNode;

import org.junit.jupiter.api.Test;

public class n382_LinkedListRandomNodeTest{
    
    n382_LinkedListRandomNode clz;
    final static int TESTCNT = 10;

    @Test
    public void test1(){
        ListNode head = new ListNode(1,2,3);
        clz = new n382_LinkedListRandomNode(head);
        int n = head.size();
        Map<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        int i = 0;
        while (curr != null){
            map.put(curr.val, i++);
            curr = curr.next;
        }

        int[] cnt = new int[n];
        for (int j = 0; j < TESTCNT * n; j++){
            cnt[map.get(clz.getRandom())]++;
        }

        for (int item : cnt){
            assertTrue(item > TESTCNT * 0.68 && item < TESTCNT * 1.32);
        }
    }
}