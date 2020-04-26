package org.example.simple.demo009;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author hzq
 * @date 2020/4/8 16:53
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int x = 1221;
        boolean palindrome = example1.isPalindrome(x);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int readNumer = 0;
        while(x > readNumer){
            readNumer = readNumer * 10 + x % 10;
            x = x / 10;
        }
        return x == readNumer || x == readNumer / 10;
    }
}
