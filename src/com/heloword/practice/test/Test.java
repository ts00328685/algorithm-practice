package com.heloword.practice.test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import com.heloword.practice.sorting.BubbleSort;
import com.heloword.practice.sorting.Sort;

public class Test {

	public static void main(String[] args) {

		Integer[] session = { 23};
		Set<Integer> collect = Arrays.stream(session).collect(Collectors.toSet());

		Integer[] deletes = { 2, 3, 76, 5 };

		System.out.println(
				Arrays.stream(deletes).allMatch(collect::contains)
		);




	}

	public static void printSortResult(Sort sort, int[] array) {
		System.out.println(Arrays.toString(sort.sort(array)));
	}

}
