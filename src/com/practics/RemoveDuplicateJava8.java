package com.practics;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateJava8 {

	public static void main(String[] args) {

		ArrayList<Integer> arrL = new ArrayList<Integer>();

		arrL.add(1);

		arrL.add(2);

		arrL.add(3);

		arrL.add(4);

		arrL.add(4);

		// System.out.println(" arr"+arrL);

		arrL.forEach(k -> System.out.println(k));

		System.out.println("====");

		arrL.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});

		Set<Integer> duplicated = arrL.stream().filter(n -> arrL.stream().filter(x -> x == n).count() > 1)
				.collect(Collectors.toSet());

		System.out.println("====");

		System.out.println("====" + duplicated);
	}
}
