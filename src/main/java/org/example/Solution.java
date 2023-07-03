package org.example;

public class Solution {

    /**
     * Finds the duplicate number in the array.
     *
     * @param nums an array of integers containing the duplicate number
     * @return the duplicate number
     */
    public int findDuplicate(int[] nums) {
        // Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];

        // Move slow pointer by 1 step and fast pointer by 2 steps until they meet
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Move slow pointer back to the start of the array
        slow = nums[0];

        // Move both pointers by 1 step until they meet again to find the duplicate number
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // Return the duplicate number
        return slow;
    }
}
