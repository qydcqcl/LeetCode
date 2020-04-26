package org.example.demo03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hzq
 * @date 2020/2/7 15:31
 */
public class Method3 {

    public static void main(String[] args) {
        Method3 method3 = new Method3();
        String s = "pwwkew";
        int i = method3.lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0, j = 0; j < n; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
