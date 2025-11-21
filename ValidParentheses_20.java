// LeetCode 20: Valid Parentheses
// Approach: Use a Stack to track opening brackets and match with closing brackets.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(stack.empty()){
                return false;
            }else if(c==')' && stack.peek()=='('){
                stack.pop();
            }else if(c=='}' && stack.peek()=='{'){
                stack.pop();
            }else if(c==']' && stack.peek()=='['){
                stack.pop();
            }else{
                return false;
            }
        }
        if(!stack.empty()){
            return false;
        }else{
            return true;
        }
    }
}
