/*
 -------------------------------------------------------------------
 LeetCode 20. Valid Parentheses
 -------------------------------------------------------------------
 Optimized Approach:
     Stack (LIFO – Last In First Out)

 Idea:
     Parentheses must be closed in the **reverse order** in which
     they are opened. This behavior is perfectly handled by a stack.

 Rules:
     • Push opening brackets onto the stack
     • For every closing bracket:
         – Stack must NOT be empty
         – Top of the stack must be the matching opening bracket
     • At the end, the stack must be empty

 Example 1:
     s = "()[]{}"
     Stack flow:
         ( → pop with )
         [ → pop with ]
         { → pop with }
     Stack empty → valid

 Example 2:
     s = "([)]"
     Stack flow:
         ( → [
         Encounter ) but top is [ → mismatch → invalid

 How It Works:
     • Opening brackets are stored
     • Closing brackets must match the most recent opening one
     • Any mismatch or extra bracket makes the string invalid

 -------------------------------------------------------------------
 Time Complexity  : O(n)
 Space Complexity : O(n)

 -------------------------------------------------------------------
*/

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else {
                // No opening bracket to match
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check for matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack must be empty for a valid string
        return stack.isEmpty();
    }
}
