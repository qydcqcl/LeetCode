package org.example.test;

import org.junit.Test;

/**
 * @author hzq
 * @date 2020/6/10 16:57
 */
public class TestBinarySytem {

    /**
     * 打印整数的二进制表示
     */
    @Test
    public void test1(){
        int a = -8;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
        System.out.println("");
    }
}
