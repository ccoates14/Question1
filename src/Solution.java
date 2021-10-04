/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solu

Test 1: nums = [2, 7, 11, 15], target = 9 Solution: [0,1]
Test 2: nums = [3, 7, 1, 10], target = 8 Solution: [1,2]
Test 3: nums = [2, 2], target = 4 Solution: [0,1]
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[] = {-1, -1};
        Map<Integer, Integer> runningNumbers = new HashMap<>();

        /*
        The obvious but non-optimal solution is n^2.
        Simply loop through the list and for each number loop through the list again skipping the outer iteration
        number and check if the outer iteration + the current iteration is equal to the sum. If it is return the two
        indexes. Also, I should say to skip any number greater or equal to the target

        The optimal solution can run in linear time with the caveat that it could take linear space.
        Loop through the list,
            if the current number is greater or equal to the target skip
            else find the required number pair, e.g. the target - the current number. If we have this number already
            in our list of running numbers which is a hashmap then we have a match and simply return the pair indexes,
            otherwise add the target - the current number to the hashmap like so
            (the target - the current number) -> current index

         */

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                final int requiredNumber = target - nums[i];

                if (runningNumbers.containsKey(requiredNumber)) {
                    sum[0] = runningNumbers.get(requiredNumber);
                    sum[1] = i;
                }else {
                    runningNumbers.put(nums[i], i);
                }
            }
        }

        return sum;
    }
}