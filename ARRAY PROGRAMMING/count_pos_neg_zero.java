package ap;

import java.util.Arrays;
import java.util.Scanner;

public class count_pos_neg_zero {

    static Scanner sc = new Scanner(System.in);

    public static void create(int[] arr) {

        int p = 0; 
        int n = 0; 
        int z = 0; 

       
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                n++;
            }
            else if (arr[i] == 0) {
                z++;
            }
            else { 
                p++;
            }
        }

        
        System.out.println("Positive numbers : " + p);
        System.out.println("Negative numbers : " + n);
        System.out.println("Zero numbers     : " + z);
    }

    public static void main(String[] args) {

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        create(arr);
    }
}


/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program counts the number of **positive**, **negative**, 
and **zero** values present in an array.

1. Three counters are created:
       p → counts positive numbers
       n → counts negative numbers
       z → counts zeros

2. The program loops through each element:
       - If arr[i] < 0 → negative count increments
       - If arr[i] == 0 → zero count increments
       - Else (arr[i] > 0) → positive count increments

3. After checking all elements, the program prints:
       - Total positive numbers
       - Total negative numbers
       - Total zeros

---------------------------------------------------
Example:
---------------------------------------------------
Input Array : [3, -1, 0, 5, -2, 0]
Positive    : 2
Negative    : 2
Zero        : 2

---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 6
Enter the array elements :
3 -1 0 5 -2 0
Positive numbers : 2
Negative numbers : 2
Zero numbers     : 2
*/
