package com.leetcode;

public class _6 {

    public static String convert(String s, int numRows) {

        String[] result = new String[numRows];

        int idx = 0;
        boolean flag = true;
        for(int i = 0; i < s.length(); i++) {

            if (result[idx] == null) {
                result[idx] = String.valueOf(s.charAt(i));
            } else {
                result[idx] += s.charAt(i);
            }

            if (flag) {
                idx++;
            } else {
                idx--;
            }

            if (idx == numRows) {
                idx -= 2;
                flag = false;

            } else if (idx == -1) {
                idx += 2;
                flag = true;
            }
        }
            String res = "";
            for(String r : result){
                res += r;
            }
            return res;
    }
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
