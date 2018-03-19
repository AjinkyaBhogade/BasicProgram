package com.infotech.program;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int i[] = { 5, 65, 8, 5, 3, 6, 9, 89, 45, 65, 32 };
		secondLargestNumber(i);
	}

	private static void secondLargestNumber(int[] i) {
		int firstLargest;
		int secondLargest;

		if (i[0] > i[1]) {
			firstLargest = i[0];
			secondLargest = i[1];
		} else {
			firstLargest = i[1];
			secondLargest = i[0];
		}

		for (int j = 2; j < i.length; j++) {
			if (i[j] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = i[j];
			} else if (i[j] < firstLargest && i[j] > secondLargest) {
				secondLargest = i[j];
			}
		}

		System.out.println("second largest number in array is" + secondLargest);
	}

}
