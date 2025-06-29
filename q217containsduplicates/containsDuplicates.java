package q217containsduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        Logger.getLogger("Enter numbers one by one (type 'done' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                numberList.add(num);
            } catch (NumberFormatException e) {
                Logger.getLogger("Invalid input. Please enter an integer or 'done'.");
            }
        }

        // Convert to int[]
        int[] nums = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            nums[i] = numberList.get(i);
        }

        // Call containsDuplicate
        Solution sol = new Solution();
        boolean hasDuplicates = sol.containsDuplicate(nums);
        Logger.getLogger("Contains duplicate? " + hasDuplicates);

        scanner.close();
    }
}