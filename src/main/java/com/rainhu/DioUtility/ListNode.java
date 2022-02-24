package com.rainhu.DioUtility;

/**
 * A simple int linked-list implement in leetcodes. 
 */

public class ListNode{
    
    public int val;
    public ListNode next;

    public ListNode() {
    }
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode(int... num){
        ListNode head = new ListNode(num[num.length-1]);
        for(int i=num.length-2; 0<i; i--){
            ListNode tmpNode = new ListNode(num[i], head);
            head = tmpNode;
        }
        this.val = num[0];
        this.next = head;
    }

    public Object[] toArray(){
        if (this.cycleFound())
            return null;
        ListNode node = this;
        Integer[] array = new Integer[this.size()];
        toArraySub(node, array);
        return array;
    }

    private void toArraySub(ListNode node, Integer[] array){
        if (node == null) return;
        int index = 0;
        while (node != null){
            array[index++] = node.val;
            node = node.next;
        }
    }

    public String toString(){
        if(cycleFound())
            return "N/A";
        return this.toArray().toString();
    }

    public int size(){
        if(cycleFound())
            return -1;
        ListNode p = this;
        int cnt = 0;
        while(p != null){
            p = p.next;
            cnt++;
        }
        return cnt;
    }

    private boolean cycleFound(){
        ListNode fast = this;
        ListNode slow = this;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public boolean equals(ListNode node){
        ListNode curr = this;
        while (curr != null && node != null){
            if (curr.val != node.val)
                return false;
            curr = curr.next;
            node = node.next;
        }
        if (curr == null && node == null)
            return true;
        return false;
    }
}
