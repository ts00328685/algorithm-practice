package com.heloword.practice.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Kyu6SimpleEncryption {

	public static void main(String[] args) {
		String motherFucker = "asd";
		System.out.println(motherFucker.length());
		System.out.println(" 20, 37, 21");
		deleteNth( new int[] { 20, 37, 20, 21 }, 1 );
		System.out.println(" 1, 1, 3, 3, 7, 2, 2, 2");
		deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 );
		System.out.println(" 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5");
		deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 );
		System.out.println(" 1, 1, 1, 1, 1");
		deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 );
		System.out.println(" ");
		deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 );
		System.out.println(" ");
		deleteNth( new int[] { }, 5 );

	}

	public static String encrypt(final String text, final int n) {
		// Your code here
		return null;
	}

	public static String decrypt(final String encryptedText, final int n) {
		// Your code here
		return null;
	}

	public static char get2NdChar(String raw) {

		if (raw.isEmpty()) {
			return ' ';
		}

		if (raw.length() == 1) {
			return raw.charAt(0);
		} else {
			return raw.charAt(1);
		}

	}

	public static String sub2NdString(String raw) {
		if (raw.length() <= 1)
			return raw;
		if (raw.length() == 1)
			return raw.substring(0, 1);
		return raw.substring(0, 1) + raw.substring(2, raw.length());
	}

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		// Code here ;)

		Map<Integer, Integer> countMap = new HashMap<>();

		// get the map that contains all the occurrence count of each element in
		// elements
		for (int element : elements) {
			Integer existing = countMap.get(element);
			countMap.put(element, existing == null ? 1 : existing + 1);
		}

		final List<Integer> elementList = Arrays.stream(elements).boxed().collect(Collectors.toList());

		countMap.forEach((key, val) -> {
			// if there's count of any element that's greater than the limit
			// remove the last occurrence in the elements;
			if (val > maxOccurrences) {
				for(int i = 0; i < val - maxOccurrences; i++ ) {
					int lastOccurIndex = elementList.lastIndexOf(key);
					elementList.remove(lastOccurIndex);
				}
			}
		});
		
		System.out.println(Arrays.toString(elementList.stream().mapToInt(Integer::intValue).toArray()));

		return elementList.stream().mapToInt(Integer::intValue).toArray();
	}
}
