class Solution {
    public String removeDuplicates(String s) {
        if (s.length() == 1) return s;
        
        // This is very similar to the problem with checking consistency for the brackets
        // Initialize a stack and if the next character = top of stack, pop from the stack
        // Build the new string with a StringBuilder
        
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c: stack) {
            sb.append(c);
        }
        return sb.toString();
        
    }
}