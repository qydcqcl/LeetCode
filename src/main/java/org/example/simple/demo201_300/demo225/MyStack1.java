package org.example.simple.demo201_300.demo225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzq
 * @date 2020/6/4 22:45
 */
public class MyStack1 {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;

    /** Initialize your data structure here. */
    public MyStack1() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() > 1){
            top = q1.remove();
            q2.add(top);
        }
        top = q1.remove();
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
        return top;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
