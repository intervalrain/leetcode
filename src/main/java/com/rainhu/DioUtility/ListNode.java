package com.rainhu.DioUtility;

/**
 * A simple int linked-list implement in leetcodes. 
 */

public class ListNode{
    
    public int val;
    public ListNode next;
    private boolean flag;

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

    public String toString(){
        if(cycleFound())
            return "N/A";
        StringBuffer tmpStr = new StringBuffer();
        ListNode tmpNode = this;
        while(tmpNode!=null) {
            tmpStr.append(Integer.toString(tmpNode.val) + ", ");
            tmpNode = tmpNode.next;
        }
        return tmpStr.toString().substring(0, tmpStr.toString().length()-2);
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
}
