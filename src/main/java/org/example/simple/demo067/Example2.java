package org.example.simple.demo067;

/**
 * @author hzq
 * @date 2020/4/11 15:51
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        String a = "11";
        String b = "1";
        String s = example2.addBinary(a, b);
        System.out.println(s);
    }

    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        if(n < m){
            return addBinary(b, a);
        }

        int l = Math.max(n, m);
        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;


        for (int i = l - 1; i > -1; --i) {
            if(a.charAt(i) == '1'){
                ++carry;
            }
            if(j > -1 && b.charAt(j--) == '1'){
                ++carry;
            }
            if(carry % 2 == 1){
                sb.append('1');
            }else{
                sb.append('0');
            }
            carry /= 2;
        }
        if(carry == 1){
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
}
