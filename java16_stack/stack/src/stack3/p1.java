package stack3;

import java.util.Arrays;
import java.util.Stack;

public class p1 {
   static  class Solution {
        boolean ok(char a,char b){
            if(a == '(' && b == ')') return true;
            else if(a == '{' && b == '}') return true;
            else if(a == '[' && b == ']') return true;
            else return false;
        }
        public boolean isValid(String s) {
            if(s.length()%2 != 0) return false;
            Stack<Character> st = new Stack();

            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '('|| ch == '{' || ch == '[') st.push(ch);
                else{
                    if(st.size() == 0) return false;
                    char top = st.peek();
                    if(ok(top,ch)) st.pop();
                    else return false;
                }
            }

            return (st.size() == 0);
        }
    }
    public static void main(String[] args) {
       String s = "()[]{}";
       Solution st = new Solution();
        System.out.println(st.isValid(s));
        // true
    }
}
//
//20. Valid Parentheses
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Hint
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//
//        Output: true
//
//        Example 2:
//
//        Input: s = "()[]{}"
//
//        Output: true
//
//        Example 3:
//
//        Input: s = "(]"
//
//        Output: false
//
//        Example 4:
//
//        Input: s = "([])"
//
//        Output: true
//
//        Example 5:
//
//        Input: s = "([)]"
//
//        Output: false
//
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//        s consists of parentheses only '()[]{}'.