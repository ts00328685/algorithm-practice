package com.heloword.practice.leetcode;

import java.util.Arrays;

public class Easy_1480_RunningSumOf1DArray {

	public static void main(String[] args) {
//				Input: nums = [1,2,3,4]
//				Output: [1,3,6,10]
//				Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
		
		int[] array = {1,2,3,4};
		
		System.out.println(Arrays.toString(runningSum(array)));
	}

	public static int[] runningSum(int[] nums) {
		int temp = 0;
		int index = 0;
		for (int num : nums) {
			nums[index] = nums[index++] + temp;
			temp += num;
		}
		return nums;
	}
}
