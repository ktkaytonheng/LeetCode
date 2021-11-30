class Solution {
    public boolean isValid(String s) {
        // Incomplete if only one character exists
        if (s.length() == 1) return false;
        
        // Make use of stack to keep track of what to match
        Stack<Character> stack = new Stack<Character>();
        
        // Push to stack if opening, pop if close & matches top of stack
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {
                char match;
                switch(s.charAt(i)) {
                    case ')':
                        match = '(';
                        break;
                    case ']':
                        match = '[';
                        break;
                    case '}':
                        match = '{';
                        break;
                    default:
                        match = '(';
                        break;
                }
                // If stack is empty, means no. of closing > no. of opening
                if (stack.isEmpty()) return false;
                if (stack.pop() != match) return false;
            }
        }
        
        // If stack is empty at the end of the string, means all opening accounted for
        if (stack.isEmpty()) return true;
        // If not empty, means no. of opening > no. of closing
        else return false;
    }
}