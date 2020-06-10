package org.example.simple.demo201_300.demo205;

/**
 * @author hzq
 * @date 2020/6/4 21:24
 */
public class Solution2 {

    public static void main(String[] args) {
        String s = "aa";
        String t = "ab";

        Solution2 solution2 = new Solution2();
        boolean isomorphic = solution2.isIsomorphic(s, t);
        System.out.println(isomorphic);
    }

    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s).equals(isIsomorphicHelper(t));
    }

    private static String isIsomorphicHelper(String s){
        int[] map = new int[128];
        int length = s.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(map[c] == 0){
                map[c] = i + 1;
            }
            builder.append(map[c]);
        }
        return builder.toString();
    }
}
