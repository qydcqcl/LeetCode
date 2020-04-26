package org.example.simple.demo069;

/**
 * @author hzq
 * @date 2020/4/24 16:07
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int x = 3;
        int i = example3.mySqrt(x);
        System.out.println(i);
    }

    public int mySqrt(int x){
        if(x < 2){
            return x;
        }
        int left = mySqrt(x >> 2) << 1;
        int right = left + 1;
        return (long)right * right > x ? left : right;
    }
}
