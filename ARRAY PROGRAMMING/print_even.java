package ap;

import java.util.Arrays;
import java.util.Scanner;

public class print_even {
	static Scanner sc= new Scanner(System.in);
	public static int [] even(int [] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
			{
				count++;	
			}	
		}
		int x=0;
		int [] result= new int[count];
		for(int s:arr) {
			if (s % 2 == 0) {

			result[x++]=s;
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		  System.out.print("Enter the size :");
		int size = sc.nextInt();
		int [] arr= new int [ size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("the even numbers  in an array :"+ Arrays.toString(even(arr)));
		
	}
		
		
}

/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program extracts and prints ONLY the even numbers
from a given array.

1. First Loop (Counting Evens):
   - Traverse the array.
   - Check each element using:
         arr[i] % 2 == 0
   - If true → increment 'count'.
   - This tells how many even numbers are there.

2. Create Result Array:
   - A new array 'result' is created with size = count.
   - This ensures memory is allocated only for even numbers.

3. Second Loop (Store Evens):
   - Again traverse the array.
   - For every even number:
         result[x++] = s;
   - 'x' keeps track of the index of result array.

4. Return the Result:
   - The array containing only even elements is returned.

Example:
Input  : [1, 2, 3, 4, 5, 6]
Output : [2, 4, 6]

---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 6
Enter the array elements :
1 2 3 4 5 6
The even numbers in the array : [2, 4, 6]
*/