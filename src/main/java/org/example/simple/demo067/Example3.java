package org.example.simple.demo067;

import java.math.BigInteger;

/**
 * @author hzq
 * @date 2020/4/11 19:17
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        String a = "11";
        String b = "1";
        String s = example3.addBinary(a, b);
        System.out.println(s);
        example3.test1();
        example3.test2();
        example3.test3();
    }

    public void test1(){
        String day = "1";

        switch (day){
            case "1" -> System.out.println("as");
            case "2" -> System.out.println("df");
            default -> {
                System.out.println("sdf");
            }
        }
    }

    public void test2(){
        Object obj = "hello world";
        if(obj instanceof String str){
            System.out.println(str);
        }
    }

    public void test3(){
        String s = """
                <html>
                    <body>
                        <p>hello world</p>
                    </body>
                </html>
                """;
        System.out.println(s);
    }

    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);

        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while(y.compareTo(zero) != 0){
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }
}
