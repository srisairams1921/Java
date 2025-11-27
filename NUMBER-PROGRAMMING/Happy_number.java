package np;
import java.util.*;

public class Happy_number {

    // Method to compute sum of squares of digits
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

   
    public static boolean isHappy(int n) {
        int slow = n; 
        int fast = n;

        do {
            slow = sumOfSquares(slow);             
            fast = sumOfSquares(sumOfSquares(fast)); 

            if (fast == 1)                         
                return true;

        } while (slow != fast);                   

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is NOT a Happy Number");
        }
    }
}



/*
---------------------------------------------------
Working Explanation:
---------------------------------------------------
A Happy Number is defined as:
1. Take a number.
2. Replace it by the sum of the squares of its digits.
3. Repeat the process.
4. If the result becomes 1 → it is a HAPPY number.
5. If it enters a loop (example: 4, 16, 37, 58, 89, ...) → it is NOT a happy number.

Example:
Input: 19

Step-by-step:
1² + 9² = 1 + 81 = 82
8² + 2² = 64 + 4 = 68
6² + 8² = 36 + 64 = 100
1² + 0² + 0² = 1

Since it reached 1 → 19 is a HAPPY number.


---------------------------------------------------
Sample Output:
---------------------------------------------------
Enter number : 19
19 is a Happy Number
*/
