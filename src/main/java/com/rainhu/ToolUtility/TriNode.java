package com.rainhu.ToolUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class TriNode{
    public int val;
    public TriNode prev;
    public TriNode next;
    public TriNode child;

    public static int EMPTY_VALUE = Integer.MIN_VALUE;

    public TriNode(int val, TriNode next, TriNode prev, TriNode child){
        this.val = val;
        this.prev = prev;
        this.child = child;
    }

    public TriNode(){
        this(EMPTY_VALUE);
    }

    public TriNode(int val){
        this(val, null, null, null);
    }
    
    public TriNode(int val, TriNode next){
        this(val, next, null, null);
    }
    public TriNode(int val, TriNode next, TriNode prev){
        this(val, next, prev, null);
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public boolean hasChild(){
        return this.child !=null;
    }
    public static TriNode toNode(Integer[] item){
        TriNode preHead = new TriNode();
        TriNode curr = preHead;
        TriNode nextNode;
        int i = 0;
        while(i < item.length){
            if (item[i] != null){
                nextNode = new TriNode(item[i], null, curr);
                curr.next = nextNode;
                curr = nextNode;
                i++;
            } else {
                curr = preHead;
                while (item[i] == null){
                    curr = curr.next;
                    i++;
                }
                Integer[] new_item = new Integer[item.length-i];
                System.arraycopy(item, i, new_item, 0, new_item.length);
                nextNode = toNode(new_item);
                curr.child = nextNode;
                break;
            }
        }
        return preHead.next;
    }
    public static Integer[] toArray(TriNode head){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> node = toArraySub(head, list);
        Integer[] res = new Integer[node.size()];
        for (int i=0; i<node.size(); i++){
            res[i] = node.get(i);
        }
        return res; 
    }
    private static ArrayList<Integer> toArraySub(TriNode head, ArrayList<Integer> list){
        TriNode curr = head;
        TriNode child = null;
        int i = 0;
        int branchIndex = -1;
        while (curr != null){
            if (curr.hasChild()){
                branchIndex = i;
                child = curr.child;   
            }
            list.add(curr.val);
            curr = curr.next;
            i++;
        }
        i = 0;
        
        while (i <= branchIndex){
            list.add(null);
            i++;
        }
        if (branchIndex >=0)
            return toArraySub(child, list);
        return list;
    }

    public String toString(){
        return Arrays.toString(toArray(this));
    }
}