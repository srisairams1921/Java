package np;
import java.util.*;
public class prime_no_in_range {
	static Scanner sc = new Scanner(System.in);
	public static boolean prime (int n) {
		if(n==0||n==1) return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
		if(prime(i)) {
			System.out.println("PRIME IN RANGE : "+ i);
		}
	}
	
}
}
/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program prints all prime numbers from 0 up to the given number n.

Prime number logic:
1. A prime number is greater than 1.
2. It must be divisible only by 1 and itself.
3. For each number i from 0 to n:
      - Skip 0 and 1 (not prime)
      - Check divisibility from 2 to i-1
      - If divisible → not prime
      - If not divisible → prime number

Example:
Input: 10

Check numbers:
2 → prime  
3 → prime  
4 → not prime  
5 → prime  
6 → not prime  
7 → prime  
8 → not prime  
9 → not prime  

Program prints prime numbers in the range:  
2, 3, 5, 7


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the number : 10
PRIME IN RANGE : 2
PRIME IN RANGE : 3
PRIME IN RANGE : 5
PRIME IN RANGE : 7
*/
