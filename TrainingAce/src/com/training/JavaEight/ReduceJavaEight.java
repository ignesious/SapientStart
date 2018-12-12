package com.training.JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * https://www.geeksforgeeks.org/stream-reduce-java-examples/
 */

public class ReduceJavaEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> integerlist = Arrays.asList(1, 2, 3, 4, 5);

		Optional<String> longestInteger = integerlist.stream().map(i -> Integer.toString(i))
				.reduce((i1, i2) -> i1 + " , " + i2);
		System.out.println(longestInteger.toString());

	}

}
