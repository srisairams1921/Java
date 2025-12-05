package ap;
import java.util.*;


public class count_even_odd {
	static Scanner sc= new Scanner(System.in);
  
 public static void countevenodd(int [] arr) {
	 int e=0,o=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]%2==0) {
			 e++;
		 }
		 else if(arr[i]%2==1)
		 {
			 o++;
		 }
	 }
	 System.out.println("ODD : "+ o);
	 System.out.println("EVEN : "+e);
 }


public static void main(String[] args) {
	  System.out.print("Enter the size :");
		int size = sc.nextInt();
		int [] arr= new int [ size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		countevenodd(arr);
}
}
/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program counts how many **even** and **odd** numbers
are present inside an array.

1. Initialize two counters:
       e = 0  → counts even numbers
       o = 0  → counts odd numbers

2. Traverse the array using a loop:
       for (int i = 0; i < arr.length; i++)

3. Check each element:
       - If arr[i] % 2 == 0 → increment even count (e++)
       - Else → increment odd count (o++)

4. After the loop ends, the total number of
   even and odd elements are printed.

---------------------------------------------------
Example:
---------------------------------------------------
Input Array : [1, 2, 3, 4, 5]
Odd Count   : 3
Even Count  : 2

---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the size : 5
Enter the array elements :
1 2 3 4 5
ODD  : 3
EVEN : 2
*/