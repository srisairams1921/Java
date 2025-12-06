package ap;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency_of_elements {

    static Scanner sc = new Scanner(System.in);

    // Method to print frequency of each element
    public static void num(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1;

            // Skip elements already marked as counted
            if (arr[i] != Integer.MIN_VALUE) {

                // Count duplicates
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = Integer.MIN_VALUE; // Mark as visited
                    }
                }

                // Print the frequency
                System.out.print("{" + arr[i] + ": " + count + "} ");
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array is: " + Arrays.toString(arr));

        num(arr);
    }
}

/*
================================================================
                          EXPLANATION
================================================================

1. User enters the size of the array.
2. User enters all elements.
3. num() method finds the frequency of each element.
4. For each element:
       - If not already counted, start count = 1
       - Compare with all next elements
       - If match found → increment count and mark duplicate
5. Print frequency in the format:
       {value: count}

✔ Time Complexity: O(n²)
✔ Space Complexity: O(1)

----------------------------------------------------------------
                        SAMPLE INPUT
----------------------------------------------------------------
Enter the size: 6
2 3 2 4 3 4

----------------------------------------------------------------
                           DRY RUN
----------------------------------------------------------------
Array: [2, 3, 2, 4, 3, 4]

i=0 → value=2 → count=1  
   j=2 → match → count=2, mark arr[2]=MIN_VALUE  
Output: {2: 2}

i=1 → value=3 → count=1  
   j=4 → match → count=2, mark arr[4]=MIN_VALUE  
Output: {3: 2}

i=2 → value=MIN_VALUE → skip

i=3 → value=4 → count=1  
   j=5 → match → count=2, mark arr[5]=MIN_VALUE  
Output: {4: 2}

i=4 → skip  
i=5 → skip

----------------------------------------------------------------
                           OUTPUT
----------------------------------------------------------------
{2: 2} {3: 2} {4: 2}
================================================================
*/
