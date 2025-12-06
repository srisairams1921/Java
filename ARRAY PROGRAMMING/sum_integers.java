package ap;

import java.util.*;

public class sum_integers {

    static Scanner sc = new Scanner(System.in);

    // Method to calculate sum of all elements in array
    public static int sum(int[] arr) {
        int sum = 0;

        // Loop through array and keep adding elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The sum of all integers in the array: " + sum(arr));
    }
}

/*
---------------------- EXPLANATION --------------------------
1. User enters the size of the array.
2. User inputs each element.
3. The sum() method loops through the array and keeps adding elements.
4. The final total is printed.

Time Complexity: O(n)
--------------------------------------------------------------

---------------------- SAMPLE INPUT -------------------------
Enter the size: 5
10 20 30 40 50

---------------------- HOW SUM WORKS ------------------------
sum = 10
sum = 10 + 20 = 30
sum = 30 + 30 = 60
sum = 60 + 40 = 100
sum = 100 + 50 = 150

---------------------- OUTPUT -------------------------------
The sum of all integers in the array: 150
--------------------------------------------------------------
*/
