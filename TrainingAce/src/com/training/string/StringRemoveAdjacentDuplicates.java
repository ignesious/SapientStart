package com.training.string;

import java.util.Arrays;

/*
 * https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates/0	
 */
public class StringRemoveAdjacentDuplicates {

	static void printAfterRemoval(char str[]) {

		int[] bitSetArray = new int[str.length];
		StringBuffer sb = new StringBuffer();
		Arrays.fill(bitSetArray, 1);
		// System.out.println(str.length);

		int i = 0;
		int j = 1;

		while (j < str.length) {
			if (str[i] == str[j]) {
				bitSetArray[j] = 0;

			}

			i++;
			j++;	

		}

		for (i = 0; i < str.length; i++) {
			if (bitSetArray[i] == 1) {
				sb.append(str[i]);
			}
		}

		System.out.println(sb.toString());

	}

	public static void main(String args[]) {

		printAfterRemoval("MISSISSIPI".toCharArray());
	}
}
