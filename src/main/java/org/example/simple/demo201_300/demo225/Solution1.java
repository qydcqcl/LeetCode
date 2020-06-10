package org.example.simple.demo201_300.demo225;

/**
 * @author hzq
 * @date 2020/6/4 22:44
 */
public class Solution1 {

    public static void main(String[] args) {
        MyStack1 obj = new MyStack1();
        obj.push(1);
        obj.push(2);
        obj.push(31);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
