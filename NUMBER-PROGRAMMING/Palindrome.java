package np;
import java.util.*;
public class Palindrome {
	static Scanner sc = new Scanner(System.in);
	
	
	public static boolean palin(int n) {
		int temp=n;
		int reverse=0;
		while(n>0) {
			int digit = n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		return temp==reverse;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		if(palin(n)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not-Plaindrome");
		}
		
		
	}


}
/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
A number is a palindrome if it reads the same forward and backward.

Program Logic:
1. Take the input number and store it in a temporary variable.
2. Reverse the number:
      - Extract last digit using n % 10
      - Add it to reverse (reverse = reverse * 10 + digit)
      - Remove last digit from n using n / 10
3. After the loop ends, compare:
      original number == reversed number
4. If equal → Palindrome  
   Else → Not Palindrome

Example:
Input: 121

Steps:
digit = 1 → reverse = 1  
digit = 2 → reverse = 12  
digit = 1 → reverse = 121  

Since 121 == 121 → Palindrome


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter the number : 121
Palindrome
*/
