/*
 -------------------------------------------------------------------
 LeetCode 191. Number of 1 Bits (Optimized Solution)
 -------------------------------------------------------------------
 Optimized Approach:
     Brian Kernighan’s Algorithm

 Idea:
     n & (n - 1) removes the **rightmost set bit** (1) from n.
     
 Example:
     n = 101100
     n - 1 = 101011
     n & (n - 1) = 101000  (rightmost 1 is removed)

 How It Works:
     Each iteration removes ONE set bit.
     So the number of iterations = number of 1s in the binary form.

 This makes it extremely fast.

 -------------------------------------------------------------------
 Time Complexity  : O(k)
     where k = number of set bits (much faster than O(log n))

 Space Complexity : O(1)

 -------------------------------------------------------------------
*/

class Solution {
    public int hammingWeight(int n) {
        
        int count = 0;

        while (n != 0) {
            n = n & (n - 1); // Remove rightmost set bit
            count++;
        }

        return count;
    }
}
