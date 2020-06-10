package org.example.simple.demo1_100.demo069;

/**
 * @author hzq
 * @date 2020/4/24 16:10
 */
public class Example4 {

    public static void main(String[] args) {
        Example4 example4 = new Example4();
        int x = 9;
        int i = example4.mySqrt(x);
        System.out.println(i);
    }

    public int mySqrt(int x){
        if (x < 2) return x;

        double x0 = x;
        double x1 = (x0 + x / x0) / 2.0;
        while (Math.abs(x0 - x1) > 1){
            x0 = x1;
            x1 = (x0 + x / x0) / 2.0;
        }
        return (int) x1;
    }
}
