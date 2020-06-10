package org.example.simple.demo201_300.demo231;

/**
 * @author hzq
 * @date 2020/6/10 16:43
 */
public class Example2 {

    public static void main(String[] args) {
        int n = 19;

        Example2 example2 = new Example2();
        boolean powerOfTwo = example2.isPowerOfTwo(n);
        System.out.println(powerOfTwo);
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        long x = (long) n;
        return (x & (-x)) == x;
    }
}
