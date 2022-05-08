package com.rainhu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 341. Flatten Nested List Iterator
 * 
 * You are given a nested list of integers nestedList.
 * Each element is either an integer or a list whose elements may also be integers or other lists.
 * Implement an iterator to flatten it.
 * 
 * Implement the NestedIterator class:
 *      + NestedIterator(List<NestedIteger> nestedList) initializes the iterator with the nested list nestedList.
 *      + int next() Returns the next integer in the nested list.
 *      + boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
 * 
 * Your code will be tested with the following pseudocode:
 * >>> intialize iterator with nestedlist
 * >>> res = []
 * >>> while iterator.hasNext()
 * >>>     append iterator.next() to the end of res
 * >>> return res
 * 
 * if res matches the expected flattened list , then your code will be judged as correct.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/5/8
 * @apiNote: iterator
 */

class NestedInteger {
    Object o;
    NestedInteger(Object o){
        this.o = (Object)o;
    }
    public boolean isInteger(){
        if (o.getClass() != Integer.class)
            return false;
        return true;
    }
    public Integer getInteger(){
        if (!isInteger())
            return null;
        return (Integer)o;
            
    }
    @SuppressWarnings("unchecked")
    public List<NestedInteger> getList(){
        if (isInteger())
            return Arrays.asList();
        return (List<NestedInteger>)o;
    }
}

public class n341_FlattenNestedListIterator implements Iterator<Integer>{
    
    LinkedList<Integer> list = new LinkedList<>();
    
    public n341_FlattenNestedListIterator(List<NestedInteger> nestedList){
        for (NestedInteger e : nestedList){
            add(e);
        }
    }

    public void add(NestedInteger e){
        if (e.isInteger())
            list.add(e.getInteger());
        else {
            for (NestedInteger e2 : e.getList()){
                add(e2);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return list.size() != 0;
    }

    @Override
    public Integer next() {
        return list.poll();
    }
}   
