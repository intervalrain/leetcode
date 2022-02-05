package com.rainhu;

import com.rainhu.DioUtility.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class n23_MergeKSortedListsTest {

    n23_MergeKSortedLists clz = new n23_MergeKSortedLists();
    ListNode[] lists;
    ListNode expected;
    ListNode actual;

    @Test
    public void test1(){
        lists = new ListNode[]{new ListNode(1,4,5), new ListNode(1,3,4), new ListNode(2,6)};
        expected = new ListNode(1,1,2,3,4,4,5,6);
        actual = clz.mergeKLists(lists);
        assertArrayEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test2(){
        lists = new ListNode[]{};
        expected = null;
        actual = clz.mergeKLists(lists);
        assertEquals(expected, actual);
    }


}
