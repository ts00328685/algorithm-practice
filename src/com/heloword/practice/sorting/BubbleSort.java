package com.heloword.practice.sorting;

public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] array) {
		
		int length = array.length;
		// temp variable for storing while swapping values
		int temp = 0;
		
		for (int i = 0; i < length; i++) {
			// traverse through all indexes
			for (int j = 1; j < (length - i); j++) {
				if (array[j - 1] > array[j]) {
					// swapping values 
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}

}
