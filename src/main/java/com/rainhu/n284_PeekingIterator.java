package com.rainhu;

import java.util.Iterator;

/**
 * 284. Peeking Iterator (Medium)
 * 
 * Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.
 * 
 * Implement the PeekingIterator Class:
 *      + PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator.
 *      + int next() returns the next element in the array and moves the pointer to the next element.
 *      + boolean hasNext() returns true if there are still elements in the array.
 *      + int peek() returns the next element in the array without moving the pointer.
 * 
 * Note: Each language may have a different implmentation
 */

public class n284_PeekingIterator implements Iterator<Integer>{
    
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        Node(){}
    }

    Node head;

	public n284_PeekingIterator(Iterator<Integer> iterator) {
	    Node dummy = new Node();
        Node curr = dummy;
        while (iterator.hasNext()){
            curr.next = new Node(iterator.next());
            curr = curr.next;
        }
        head = dummy.next;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return head.val;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int value = head.val;
        head = head.next;
        return value;
	}
	
	@Override
	public boolean hasNext() {
	    return head != null;
	}
}
