package ap;

import java.util.*;

public class largest_Smallest {

    static Scanner sc = new Scanner(System.in);

    public static void ls(int[] arr) {

        int lar = Integer.MIN_VALUE;  // largest number
        int sm  = Integer.MAX_VALUE;  // smallest number

        for (int i = 0; i < arr.length; i++) {

            // Check largest
            if (arr[i] > lar) {
                lar = arr[i];
            }

            // Check smallest
            if (arr[i] < sm) {
                sm = arr[i];
            }
        }

        System.out.println("The largest number in array  : " + lar);
        System.out.println("The smallest number in array : " + sm);
    }

    public static void main(String[] args) {

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ls(arr);
    }
}


/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program finds the **largest** and **smallest**
values in an array.

1. Two variables are initialized:
       lar = Integer.MIN_VALUE   // stores the maximum value
       sm  = Integer.MAX_VALUE   // stores the minimum value

2. The array is scanned using a loop:
       - If arr[i] > lar  
             → assign lar = arr[i]

       - If arr[i] < sm  
             → assign sm = arr[i]

   Using two separate 'if' conditions ensures
   all elements are checked correctly.

3. After the loop:
       lar contains the largest number
       sm contains the smallest number

4. These values are printed to the user.

---------------------------------------------------
Example:
---------------------------------------------------
Input  : [10, 5, 20, 1, 7]
Largest : 20
Smallest: 1

---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 5
Enter the array elements :
10 5 20 1 7
The largest number in array  : 20
The smallest number in array : 1
---------------------------------------------------
*/
