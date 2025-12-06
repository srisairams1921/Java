package ap;

import java.util.*;

public class sum_integers {
    static Scanner sc = new Scanner(System.in);

    // Method to calculate sum of all integers in the array
    public static int sum(int[] arr) {
        int sum = 0;

        // Loop through each element and add to sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The sum of all integers in the array: " + sum(arr));
    }
}

/*
----------------------- EXPLANATION ------------------------
User gives size → program creates array.

Then user enters numbers which are stored in arr[].

sum() method:
--------------
Initial sum = 0
Loop through array:
    sum = sum + arr[i]

Finally return the sum.

------------------------------------------------------------
EXAMPLE INPUT:
Enter the size: 5
10 20 5 -3 8

CALCULATION:
10 + 20 + 5 + (-3) + 8 = 40

------------------------------------------------------------
OUTPUT:
The sum of all integers in the array: 40
------------------------------------------------------------
*/
