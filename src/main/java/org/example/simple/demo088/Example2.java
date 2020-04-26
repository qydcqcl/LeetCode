package org.example.simple.demo088;

import java.util.Arrays;

/**
 * @author hzq
 * @date 2020/4/24 17:04
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        example2.merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while(p1 < m && p2 < n){
            nums1[p++] = nums1Copy[p1] < nums2[p2] ? nums1Copy[p1++] : nums2[p2++];
        }

        if(p1<m){
            System.arraycopy(nums1Copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        }
        if(p2 < n){
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }


    }
}
