package com.heloword.practice.leetcode;

public class Easy_344_ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString(new char[] {'a', 'b', 'c'}));
	}

	public static String reverseString(char[] s) {

		for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}

		// s = new StringBuilder(new String(s)).reverse().toString().toCharArray();
		return String.valueOf(s);
	}
}
