package np;
import java.util.*;
public class Prime_Number {
	
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
		if(prime(n)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not-Prime");
		}
	}

}
/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program checks whether a given number is prime or not.

Prime number logic:
1. A prime number is greater than 1.
2. It must have exactly two factors: 1 and itself.
3. Steps followed:
      - If number is 0 or 1 → not prime
      - For numbers ≥ 2:
           Check divisibility from 2 to n-1
           If divisible → not prime
           If no divisor found → prime

Example:
Input: 7

Checking:
7 % 2 → not zero  
7 % 3 → not zero  
7 % 4 → not zero  
7 % 5 → not zero  
7 % 6 → not zero  

Since no divisor found → 7 is prime.


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the number : 7
Prime
*/
