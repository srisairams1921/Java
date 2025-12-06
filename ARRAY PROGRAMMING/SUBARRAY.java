package ap;

import java.util.Scanner;

public class SUBARRAY {
    static Scanner sc = new Scanner(System.in);

    // Method to find maximum subarray sum using brute force
    public static void sub(int[] arr) {
        int max = 0;  // stores maximum subarray sum

        // Outer loop → starting index
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;  // sum of current subarray

            // Inner loop → ending index
            for (int j = i; j < arr.length; j++) {

                sum += arr[j]; // keep adding next element

                // Compare current subarray sum with max
                max = Math.max(sum, max);
            }
        }

        System.out.println("Maximum Subarray Sum = " + max);
    }

    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sub(arr);
    }
}

/*
---------------------- EXPLANATION -------------------------
This program checks ALL possible subarrays.

For each index 'i':
    Start a new sum = 0
    Then keep adding elements arr[j] (j = i to end)

For every subarray, compare the sum with 'max'.

Time complexity: O(n^2) (because of double loop)

---------------------- SAMPLE INPUT ------------------------
Enter the size: 5
5 -2 3 4 -1

---------------------- SUBARRAY SUMS -----------------------
[5]               = 5
[5, -2]           = 3
[5, -2, 3]        = 6
[5, -2, 3, 4]     = 10   ← maximum
[5, -2, 3, 4, -1] = 9

[-2]              = -2
[-2, 3]           = 1
[-2, 3, 4]        = 5
[-2, 3, 4, -1]    = 4

[3]               = 3
[3, 4]            = 7
[3, 4, -1]        = 6

[4]               = 4
[4, -1]           = 3

[-1]              = -1

---------------------- OUTPUT ------------------------------
Maximum Subarray Sum = 10
------------------------------------------------------------
*/
