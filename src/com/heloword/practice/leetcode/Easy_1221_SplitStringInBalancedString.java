package com.heloword.practice.leetcode;

import java.util.Stack;

public class Easy_1221_SplitStringInBalancedString {

    public static void main(String[] args) {

        String s = "RLRRLLRLRL";

        int result = 0, count = 0;

        for(char c : s.toCharArray()) {
            // 舉手演算法
            // only applicable to binary option questions
            count += c == 'L' ? 1 : -1;
            if(count == 0) {
                result++;
            }
        }
        System.out.println(result);

    }
}
