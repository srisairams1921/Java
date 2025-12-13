/*
 -------------------------------------------------------------------
 LeetCode 977. Squares of a Sorted Array
 -------------------------------------------------------------------
 Optimized Approach:
     Two Pointer Technique

 Idea:
     The array is already sorted, but may contain negative numbers.
     After squaring, negative values can become larger than positives.

     The largest square will always come from either:
         - the left end (large negative)
         - or the right end (large positive)

     So we compare both ends and place the larger square at the end
     of the result array.

 Example:
     nums = [-4, -1, 0, 3, 10]

     Compare:
         |-4| = 4  and  |10| = 10 → 10² = 100 (place last)
         |-4| = 4  and  |3|  = 3  → (-4)² = 16
         |-1| = 1  and  |3|  = 3  → 3² = 9
         |-1| = 1  and  |0|  = 0  → (-1)² = 1
         Remaining → 0² = 0

     Result:
         [0, 1, 9, 16, 100]

 How It Works:
     • Use two pointers: left (start), right (end)
     • Compare squares from both ends
     • Place the larger square at the current last index
     • Move pointers inward

 -------------------------------------------------------------------
 Time Complexity  : O(n)
 Space Complexity : O(n)

 -------------------------------------------------------------------
*/

class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }
}
