package com.heloword.practice.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Easy_1207_UniqueNumberOfOccurrences {

	public static void main(String[] args) {
//		Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
//		Example 1:
//		Input: arr = [1,2,2,1,1,3]
//		Output: true
//		Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

		System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
	}

	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> container = new HashMap<>();
		for (int num : arr) {
			container.put(num, container.get(num) == null ? 0 : container.get(num) + 1);
		}
		Set<Integer> containerSet = new HashSet<>();
		for (Integer i : container.values()) {
			containerSet.add(i);
		}
		return container.size() == containerSet.size();
	}
}
