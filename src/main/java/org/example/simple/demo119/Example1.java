package org.example.simple.demo119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 *
 * @author hzq
 * @date 2020/5/1 14:23
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        List<Integer> row = example1.getRow1(5);
        System.out.println(Arrays.toString(row.toArray()));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for (int i = 0; i < rowIndex; i++) {
            cur = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    cur.add(1);
                } else {
                    cur.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return cur;
    }

    public List<Integer> getRow1(int rowIndex) {
        int pre = 1;
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        for (int i = 1; i < rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                cur.set(j, cur.get(j - 1) + cur.get(j));
            }
            cur.add(1);//补上每层的最后一个 1
        }
        return cur;
    }

}
