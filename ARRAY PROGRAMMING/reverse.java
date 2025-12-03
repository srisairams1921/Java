package ap;

import java.util.*;;

public class reverse {
	static Scanner sc= new Scanner(System.in);
	
	public static int [] reversea(int [] arr) {
		int l=0,r=arr.length-1;
		while(l<r) {
			int temp= arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		  System.out.print("Enter the size :");
			int size = sc.nextInt();
			int [] arr= new int [ size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("The reverse array : "+ Arrays.toString(reversea(arr)));}
}


/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program reverses an array using the two-pointer method.

1. Two pointers are used:
     l = 0              // left pointer
     r = arr.length-1   // right pointer

2. While l < r:
     - Swap arr[l] and arr[r]
     - Move l forward  (l++)
     - Move r backward (r--)

3. This swapping continues until the left pointer
   meets or crosses the right pointer.

4. Finally, the reversed array is printed.

Example:
Input Array:  [1, 2, 3, 4, 5]
After Reverse: [5, 4, 3, 2, 1]


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 5
Enter the array elements :
1 2 3 4 5
The reverse array : [5, 4, 3, 2, 1]
*/
