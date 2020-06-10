package org.example.simple.demo101_200.demo155;

import java.util.Stack;

/**
 * @author hzq
 * @date 2020/5/1 16:22
 */
public class MinStack2 {

    // 数据栈
    private Stack<Integer> data;
    // 辅助栈
    private Stack<Integer> helper;

    /** initialize your data structure here. */
    public MinStack2() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    // 思路 2：辅助栈和数据栈不同步
    // 关键 1：辅助栈的元素空的时候，必须放入新进来的数
    // 关键 2：新来的数小于或者等于辅助栈栈顶元素的时候，才放入（特别注意这里等于要考虑进去）
    // 关键 3：出栈的时候，辅助栈的栈顶元素等于数据栈的栈顶元素，才出栈，即"出栈保持同步"就可以了
    public void push(int x) {
        data.add(x);
        if(helper.isEmpty() || helper.peek() >= x){
            helper.add(x);
        }
    }

    public void pop() {
        // 关键 3：data 一定得 pop()
        if(!data.isEmpty()){
            int pop = data.pop();
            // 注意：声明成 int 类型，这里完成了自动拆箱，从 Integer 转成了 int，因此下面的比较可以使用 "==" 运算符
            // 参考资料：https://www.cnblogs.com/GuoYaxiang/p/6931264.html
            // 如果把 top 变量声明成 Integer 类型，下面的比较就得使用 equals 方法
            if(pop == helper.peek()){
                helper.pop();
            }
        }
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public static void main(String[] args) {
        MinStack2 minStack2 = new MinStack2();
        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-3);

        int min = minStack2.getMin();
        System.out.println(min);

        minStack2.pop();
        int top = minStack2.top();
        System.out.println(top);

        int min1 = minStack2.getMin();
        System.out.println(min1);
    }
}
