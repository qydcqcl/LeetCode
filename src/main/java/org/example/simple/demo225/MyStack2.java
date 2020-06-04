package org.example.simple.demo225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzq
 * @date 2020/6/4 22:54
 */
public class MyStack2 {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;

    /** Initialize your data structure here. */
    public MyStack2() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        top = x;
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        q1.remove();
        int res = top;
        while(!q1.isEmpty()){
            top = q1.peek();
        }
        return res;
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
