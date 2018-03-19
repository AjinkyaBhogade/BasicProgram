package com.infotech.program;

import java.util.HashSet;

public class CommonElemetInTwoArray {

	public static void main(String[] args) {

		String array1[] = { "one", "two", "three", "four", "five" };
		String array2[] = { "ei-ght", "nine", "ten", "four", "six", "seven", "two" };
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					set.add(array1[i]);
				}
			}
		}
		System.out.println(set);
	}

}
