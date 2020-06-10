package org.example.simple.demo1_100.demo028;

/**
 * @author hzq
 * @date 2020/4/10 14:49
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        String haystack = "hello";
        String needle = "ll";
        int i = example2.strStr(haystack, needle);

    }

    public int strStr(String haystack, String needle){
        int l = needle.length();
        int n = haystack.length();

        int pn = 0;
        while(pn < n - l + 1){
            //查询首字母相同的字符
            while (pn < n - l + 1 && haystack.charAt(pn) != needle.charAt(0)) {
                ++pn;
            }

            //
            int currLen = 0;
            int pl = 0;
            while (pl < l && pn < n && haystack.charAt(pn) == needle.charAt(pl)) {
                ++pn;
                ++pl;
                ++currLen;
            }

            if(currLen == l){
                return pn - l;
            }

            pn = pn - currLen + 1;
        }
        return -1;
    }
}
