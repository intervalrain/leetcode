package com.rainhu.ToolUtility;

/**
 * A linked list of length n is given such that each node contains an additional random pointer, 
 * which could point to any node in the list, or null.
 */

public class RandomNode extends ListNode{
    
    private RandomNode random;
    private RandomNode[] table;
    private int order;

    public RandomNode() {
        super();
    }

    public RandomNode(int val){
        this.val = (int)val;
    }

    // quick constructor for RandomNode
    public RandomNode(Integer[][] nums) throws IllegalArgumentException {
        this.val = nums[0][0];
        int n = nums.length;
        RandomNode[] nodes = new RandomNode[n];
        this.table = nodes;
        nodes[0] = this;
        if (nums[0].length != 2) throw new IllegalArgumentException("Each array must be length of 2.");
        for (int i = 1; i < n; i++){
            if (nums[i].length != 2) throw new IllegalArgumentException("Each array must be length of 2.");
            nodes[i] = new RandomNode((int)nums[i][0]);
            nodes[i-1].next = nodes[i];
            nodes[i].order = i;
        }
        for (int i = 0; i < n; i++){
            nodes[i].random = nums[i][1] == null ? null : nodes[nums[i][1]];
            nodes[i].table = nodes;
        }
    }

    @Override
    public String toString(){
        if(cycleFound())
            return "N/A";
        StringBuilder sb = new StringBuilder();
        RandomNode curr = this;
        for (int i = 0; i < this.size(); i++){
            sb.append('[');
            sb.append(curr.val);
            sb.append(',');
            sb.append(curr.random != null ? curr.random.order : "null");
            sb.append("],");
            curr = (RandomNode)curr.next;
        }
        return sb.substring(0, sb.length()-1);
    }

    @Override
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

    public static void main(String[] args){
        RandomNode node = new RandomNode(new Integer[][]{{7,null},{13,0},{11,4},{10,2},{1,0}});
        System.out.println(node.toString());
        System.out.println(node.table instanceof RandomNode[]);
    }
}
