package np;
import java.util.*;

public class Fibnacci {
	static Scanner sc = new Scanner(System.in);
	
	public static void fibo(int n) {
		
		
		int n1=0;
		int n2=1;
		
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=n;i++) {
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the nth series : ");
		int n= sc.nextInt();
		fibo(n);
		
		
	}

}

/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
This program prints the Fibonacci series.

1. The first two numbers are fixed:
   n1 = 0
   n2 = 1

2. These two values are printed first.

3. A loop runs 'n' times, and each time:
     n3 = n1 + n2     // next Fibonacci number
     print n3
     n1 becomes n2
     n2 becomes n3

4. This process continues and generates the Fibonacci sequence.

Example:
If n = 5
Sequence:
0 1 1 2 3 5 8


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the nth series : 5
0 1 1 2 3 5 8
*/

