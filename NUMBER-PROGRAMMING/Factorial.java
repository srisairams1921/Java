package np;
import java.util.*;

public class Factorial {
	static Scanner sc= new Scanner(System.in);
	
	public static int fact(int n) {
		int product =1;
		for(int i=n;i>=1;i--) {
			product=product*i;
		}
		return product;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		System.out.println("The factorial of a "+ n + " :" + fact(n));
	}

}
/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program calculates the factorial of a number.

Factorial logic:
factorial(n) = n × (n-1) × (n-2) × ... × 1

1. Start with product = 1
2. Run a loop from n down to 1
3. Multiply product with the current number each time
4. Return the final product

Example:
If n = 5
Calculation:
5 × 4 × 3 × 2 × 1 = 120


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the number : 5
The factorial of 5 :120
*/

