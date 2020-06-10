package org.example.simple.demo101_200.demo118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * @author hzq
 * @date 2020/5/1 14:12
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        List<List<Integer>> lists = example1.generate(5);
        System.out.println(Arrays.toString(lists.toArray()));

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        //First base case; if user requests zero rows, they get zero rows.
        if(numRows == 0){
            return triangle;
        }

        //Second base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum  = 1; rowNum < numRows; rowNum++){

            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            //The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++){
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
