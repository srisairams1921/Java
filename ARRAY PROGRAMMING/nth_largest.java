package ap;

import java.util.Arrays;
import java.util.Scanner;

public class nth_largest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter n (which largest number you want): ");
        int n = sc.nextInt();

        Arrays.sort(arr); // sort ascending

        int k = 1; // count unique largest positions

        // Traverse from last (largest) to first
        for (int i = arr.length - 1; i > 0; i--) {

            if (k == n) {  
                System.out.println("The " + n + "th largest element : " + arr[i]);
                return;
            }

            // Count only unique values
            if (arr[i] != arr[i - 1]) {
                k++;
            }

            if (k == n) {
                System.out.println("The " + n + "th largest element : " + arr[i - 1]);
                return;
            }
        }

        // If array has all same values or n == 1
        if (n == 1) {
            System.out.println("The 1st largest element : " + arr[arr.length - 1]);
        } else {
            System.out.println("Not enough unique elements.");
        }
    }
}

/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program finds the **Nth largest unique element**
in an integer array.

1. Input:
   - Size of array
   - Array elements
   - Value of n (1st largest, 2nd largest, etc.)

2. Sorting:
   The array is sorted in ascending order using:
       Arrays.sort(arr);

   So the largest elements are at the end.

3. Logic:
   - Traverse the array from right to left.
   - Maintain a counter 'k' to track unique largest values.
   - Only increase 'k' when a *new* unique value is found.

   Example:
       Array: [3, 5, 5, 6, 7, 7]
       Unique order from largest:
       7 (1st), 6 (2nd), 5 (3rd), 3 (4th)

4. Conditions:
   - When k == n → print the nth largest value.
   - If all values are same and n == 1 → print the last element.
   - If not enough unique elements → show message.

---------------------------------------------------
Example:
---------------------------------------------------
Input  : [4, 6, 1, 6, 9, 9, 2]
Sorted : [1, 2, 4, 6, 6, 9, 9]

Unique descending:
9 → 1st largest  
6 → 2nd largest  
4 → 3rd largest  
2 → 4th largest  

If n = 3 → Output: 4

---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 7
Enter the array elements :
4 6 1 6 9 9 2
Enter n : 3
The 3rd largest element : 4
---------------------------------------------------
*/
