package org.example.simple.demo069;

import org.example.simple.demo067.Example3;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * @author hzq
 * @date 2020/4/24 15:10
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int x = 9;
        int sqrt = example1.mySqrt(x);
        System.out.println(sqrt);
    }

    public int mySqrt(int x){
        if(x < 2){
            return 1;
        }
        int left = (int) Math.pow(Math.E, 0.5*Math.log(x));
        int right = left + 1;
        return (long)right * right > x ? left : right;
    }

}
