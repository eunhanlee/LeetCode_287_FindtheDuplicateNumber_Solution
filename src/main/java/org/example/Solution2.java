package org.example;

import java.util.Arrays;

class Solution2 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) return nums[i];
        }

        return -1;
    }
}