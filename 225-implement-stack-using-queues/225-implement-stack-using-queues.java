class MyStack {
    // This solution implements 2 queues, where q1 is the primary queue keeping the elements of the 'stack'
    // The only difference would be pop() and top(), since the top for queue and stacks are on different 
    // ends. To mimic a stack, first we have to poll() from q1 till there's one remaining, and return that 
    // last element as required. Then we transfer everything from q2 back into q1.
    
    // q1: 1,2,3,4,5
    // q2: 
    // pop()/top(): 
    
    // q1: 5
    // q2: 1,2,3,4
    // pop()/top(): 
    
    // q1: 1,2,3,4
    // q2: 
    // pop()/top(): 5
    
    // The time complexity is about O(2n), which is still O(n), so pretty decent.
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.poll();
        while (q2.size() >= 1) {
            q1.add(q2.poll());
        }
        return top;
    }
    
    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.poll();
        q2.add(top);
        while (q2.size() >= 1) {
            q1.add(q2.poll());
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */