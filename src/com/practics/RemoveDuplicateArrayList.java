package com.practics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);

		list.add(2);

		list.add(2);

		list.add(4);

		System.out.println(list);

		List duplicate = new ArrayList();

		for (int i = 0; i < list.size(); i++) {

			Integer count = list.get(i);

			if (!duplicate.contains(count)) {

				duplicate.add(count);

			} else {

				System.out.println("item duplicate values====" + count);

			}

		}

		System.out.println("duplicates" + duplicate);
	}
}
