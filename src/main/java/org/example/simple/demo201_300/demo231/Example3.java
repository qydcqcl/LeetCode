package org.example.simple.demo201_300.demo231;

/**
 * @author hzq
 * @date 2020/6/10 17:56
 */
public class Example3 {

    public static void main(String[] args) {
        int n = 16;
        Example3 example3 = new Example3();
        boolean powerOfTwo = example3.isPowerOfTwo(n);
        System.out.println(powerOfTwo);
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        long x = (long)n;
        return (x & (x - 1)) == 0;
    }
}

