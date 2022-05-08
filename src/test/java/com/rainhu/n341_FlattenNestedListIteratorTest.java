package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n341_FlattenNestedListIteratorTest {
    
    List<Integer> expected;

    @Test
    public void test1(){
        ArrayList<NestedInteger> list = new ArrayList<>();
        list.add(new NestedInteger((Object)1));
        list.add(new NestedInteger((Object)1));
        NestedInteger e1 = new NestedInteger((Object)list);
        NestedInteger e2 = new NestedInteger((Object)2);
        NestedInteger e3 = new NestedInteger((Object)list);
        List<NestedInteger> nestedList = Arrays.asList(e1, e2, e3);
        n341_FlattenNestedListIterator iter = new n341_FlattenNestedListIterator(nestedList);
        List<Integer> res = new ArrayList<>();
        while (iter.hasNext()){
            res.add(iter.next());
        }
        expected = Arrays.asList(1,1,2,1,1);
        assertEquals(expected, res);
    }

    @Test
    public void test2(){
        NestedInteger e1 = new NestedInteger((Object)6);
        List<NestedInteger> list1 = new ArrayList<>();
        list1.add(new NestedInteger(4));
        list1.add(e1);
        NestedInteger e2 = new NestedInteger(list1);
        List<NestedInteger> list2 = new ArrayList<>();
        list2.add(new NestedInteger(1));
        list2.add(e2);
        NestedInteger e3 = new NestedInteger(list2);
        List<NestedInteger> nestedList = Arrays.asList(e3);
        n341_FlattenNestedListIterator iter = new n341_FlattenNestedListIterator(nestedList);
        List<Integer> res = new ArrayList<>();
        while (iter.hasNext()){
            res.add(iter.next());
        }
        expected = Arrays.asList(1,4,6);
        assertEquals(expected, res);
    }
}
