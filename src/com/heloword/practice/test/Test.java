package com.heloword.practice.test;

import java.util.Arrays;

import com.heloword.practice.sorting.BubbleSort;
import com.heloword.practice.sorting.Sort;

public class Test {

	public static void main(String[] args) {

		int[] array = { 3, 4, 5, 1, 2 };

		printSortResult(new BubbleSort(), array);

	}

	public static void printSortResult(Sort sort, int[] array) {
		System.out.println(Arrays.toString(sort.sort(array)));
	}

}
