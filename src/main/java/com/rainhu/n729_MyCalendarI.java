package com.rainhu;

import java.util.ArrayList;

public class n729_MyCalendarI{
    public ArrayList<Integer> dp;
    public n729_MyCalendarI() {
        dp = new ArrayList<Integer>();
    }
    
    public boolean book(int start, int end) {
        int pos = upper_bound(dp, start);
        if (pos == dp.size()){
            dp.add(start);
            dp.add(end);
            return true;
        } else {
            if ((pos % 2 == 1) || end > dp.get(pos)) return false;
        }
        dp.add(pos, end);
        dp.add(pos, start);
        return true;
    }
    public int upper_bound(ArrayList<Integer> dp, int target){
        int left = 0, right = dp.size()-1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (dp.get(mid) > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

