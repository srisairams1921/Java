/*
 ---------------------------------------------------------------
 LeetCode 229. Majority Element II
 ---------------------------------------------------------------
 Problem:
    Given an integer array nums of size n, return all elements 
    that appear more than ⌊ n/3 ⌋ times.

 Examples:
    Input:  [3,2,3]
    Output: [3]

    Input:  [1]
    Output: [1]

    Input:  [1,2]
    Output: [1,2]

 ---------------------------------------------------------------
 Why Boyer–Moore Voting Algorithm?
 ---------------------------------------------------------------
 - At most TWO elements can appear more than n/3 times.
 - So we track two candidates and their counts.
 - First pass: Find possible candidates.
 - Second pass: Verify them.

 Time Complexity:  O(n)
 Space Complexity: O(1)   (only 2 candidates + counters)
 ---------------------------------------------------------------
 Steps:
    Step-1 → Find two potential candidates using voting logic.
    Step-2 → Reset counts and count the real occurrences.
    Step-3 → Add candidates to result if they appear > n/3.
 ---------------------------------------------------------------
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Step-1: Two candidates and their counts
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                // Reduce both counts
                count1--;
                count2--;
            }
        }

        // Step-2: Verify the counts again
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        // Step-3: Prepare the result
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;

        if (count1 > threshold)
            result.add(candidate1);

        if (count2 > threshold)
            result.add(candidate2);

        return result;
    }
}
