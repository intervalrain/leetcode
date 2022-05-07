package com.rainhu;

/**
 * 456. 132 Pattern (Medium)
 * 
 * Given an array of n integers nums,
 * a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and
 * nums[i] < nums[k] < nums[i].
 * 
 * Return true if there is 132 pattern in nums, otherwise return false.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/8
 * @apiNote:
 */

public class n456_132Pattern {


    // best solution
    public boolean find132pattern(int[] nums){
        int n = nums.length;
        if (n < 3) return false;
        int[] min = new int[n];
        int[] max = new int[n];
        
        min[0] = nums[0];
        max[0] = nums[0];

        for (int i = 1; i < n; i++){
            if (nums[i] >= max[i-1]){
                max[i] = nums[i];
                min[i] = min[i-1];
            } else if (nums[i] <= min[i-1]){
                min[i] = nums[i];
                max[i] = max[i-1];
            } else {
                int j = 0;
                for (j = i - 1; j >= 1; j--){
                    if (nums[j] > nums[i])
                        break;
                }
                if (j >= 1 && min[j-1] < nums[i])
                    return true;
                max[i] = max[i-1];
                min[i] = min[i-1];
            }
        }
        return false;
    }

    public boolean find132pattern2(int[] nums){
        int n = nums.length;
        if (n < 3) return false;

        int i, j, k;
        k = n - 1;
        j = n - 2;
        i = n - 3;
        while (i >= 0){
            while (j > 1 && nums[j] < nums[k]){
                j--;
                k = j + 1;
            }
            i = j - 1;
            while (i >= 0 && nums[i] <= nums[i+1]){
                i--;
            }
            if (i+1 != j) i++;
            
            while (k < n - 1 && nums[i] >= nums[k]){
                k++;
            }
            if (nums[i] < nums[k] && nums[j] > nums[k]) return true;
            j--;
            i = j - 1;
            k = j + 1;
        }
        return false;
    }

    public static void main(String[] args){
        n456_132Pattern clz = new n456_132Pattern();
        int[] nums = new int[]{13,14,16,10,11,12,0,1,2,3,15,17};
        System.out.println(clz.find132pattern(nums));
    }
}
