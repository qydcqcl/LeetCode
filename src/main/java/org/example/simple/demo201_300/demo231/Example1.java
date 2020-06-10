package org.example.simple.demo201_300.demo231;

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
//
// 示例 1:
//
// 输入: 1
//输出: true
//解释: 20 = 1
//
// 示例 2:
//
// 输入: 16
//输出: true
//解释: 24 = 16
//
// 示例 3:
//
// 输入: 218
//输出: false
// Related Topics 位运算 数学
/**
 * @author hzq
 * @date 2020/6/10 16:32
 */
public class Example1 {

    public static void main(String[] args) {
        int n = 216;

        Example1 example1 = new Example1();
        boolean powerOfTwo = example1.isPowerOfTwo(n);
        System.out.println(powerOfTwo);
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        while(n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}
