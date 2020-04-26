package org.example.simple.demo069;

/**
 * @author hzq
 * @date 2020/4/24 15:23
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int x = 9;
        int i = example2.mySqrt(x);
        System.out.println(i);
    }

    public int mySqrt(int x){
        if(x < 2){
            return x;
        }
        long num = 0L;
        int pivot = 0, left = 2, right = x / 2;
        while (left<=right){
            pivot = left + (right - left) / 2;
            num = pivot * pivot;
            if(num > x){
                right = pivot - 1;
            }else if(num < x){
                left = pivot + 1;
            }else{
                return pivot;
            }
        }
        return right;
    }
}
