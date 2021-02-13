package com.heloword.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Medium_1525_NumberOfGoodWaysToSplitAString {
	public static void main(String[] args) {
//		You are given a string s, a split is called good if you can split s into 2 non-empty strings p and q where its concatenation is equal to s and the number of distinct letters in p and q are the same.
//		Return the number of good splits you can make in s.
//
//		Example 1:
//
//		Input: s = "aacaba"
//		Output: 2
//		Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
//		("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
//		("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
//		("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
//		("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
//		("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.
		
		System.out.print(numSplits("aacaba"));

	}

	public static int numSplits(String s) {

		int strLength = s.length();
		int[] prefix = new int[strLength];
		int[] suffix = new int[strLength];

		Set<Character> leftSet = new HashSet<>();
		Set<Character> rightSet = new HashSet<>();
		char[] chars = s.toCharArray();

		// get the table of distinct count of prefix and suffix
		for (int i = 0, k = s.length() - 1; i < strLength; i++, k--) {
			leftSet.add(chars[i]);
			prefix[i] = leftSet.size();
			rightSet.add(chars[k]);
			suffix[strLength - i - 1] = rightSet.size();
		}

		int goodCount = 0;

		// compare the prefix and suffix
		for (int i = 0; i < strLength - 1; i++) {

			if (prefix[i] == suffix[i + 1]) {
				goodCount++;
			}

		}

		return goodCount;

	}
}
