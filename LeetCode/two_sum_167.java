/*
 -------------------------------------------------------------------
 LeetCode 167. Two Sum II – Input Array Is Sorted
 -------------------------------------------------------------------
 Optimized Approach:
     Two Pointer Technique (Constant Extra Space)

 Idea:
     The array is already sorted in non-decreasing order.
     We use two pointers:
         • left  → start of the array
         • right → end of the array

     By comparing the sum of numbers[left] and numbers[right]
     with the target, we can decide which pointer to move.

 Rules:
     • If sum == target → solution found
     • If sum < target  → move left pointer right (increase sum)
     • If sum > target  → move right pointer left (decrease sum)

 Example:
     numbers = [2, 7, 11, 15], target = 9

     left = 2, right = 15 → sum = 17 (too large) → move right
     left = 2, right = 11 → sum = 13 (too large) → move right
     left = 2, right = 7  → sum = 9  (found)

     Indices (1-based):
         index1 = 1, index2 = 2

 How It Works:
     • Since the array is sorted, increasing left increases the sum
     • Decreasing right decreases the sum
     • Exactly one valid solution exists

 -------------------------------------------------------------------
 Time Complexity  : O(n)
 Space Complexity : O(1)   (constant extra space)

 -------------------------------------------------------------------
*/

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-based indices
                return new int[] { left + 1, right + 1 };
            }
            else if (sum < target) {
                left++;    // Increase sum
            }
            else {
                right--;   // Decrease sum
            }
        }

        // Problem guarantees exactly one solution
        return new int[] {};
    }
}
