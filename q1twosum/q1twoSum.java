package q1twosum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // Return empty (although problem says one solution always exists)
        return new int[] {};
    }
}
