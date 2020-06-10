package org.example.simple.demo201_300.demo225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzq
 * @date 2020/6/4 23:02
 */
public class MyStack3 {

    private Queue<Integer> q = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack3() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size > 1){
            q.add(q.remove());
            size--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.remove();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
