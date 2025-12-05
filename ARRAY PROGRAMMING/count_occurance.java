package ap;

import java.util.*;

public class count_occurance {
	static Scanner sc= new Scanner(System.in);
	
	public static int count_occ(int[] arr , int key) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		 System.out.print("Enter the size :");
			int size = sc.nextInt();
			int [] arr= new int [ size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.print("Enter the key :");
			int key=sc.nextInt();
			
			
			System.out.println("The occurance of the element : " +count_occ(arr,key) );
		
	}

}
/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program counts how many times a specific value 
(called 'key') appears in the array.

1. Input:
   - User enters the size of the array.
   - User enters the array elements.
   - User enters the 'key' value to search for.

2. count_occ() Method:
   - Initialize count = 0.
   - Loop through each array element.
   - If arr[i] == key → increment count.

3. Return:
   - The method returns the total number of times
     the key appears in the array.

---------------------------------------------------
Example:
---------------------------------------------------
Input Array : [1, 3, 2, 3, 4, 3]
Key         : 3
Output      : 3
(3 appears three times)

---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 6
Enter the array elements :
1 3 2 3 4 3
Enter the key : 3
The occurrence of the element : 3
*/