package com.practics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCharactorsCounts {
	public static void main(String[] args) {
		String str = " Hi hello i am krishna dddddddddddddd";
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		char[] chararry = str.toCharArray();
		for (Character ch : chararry) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}

		Set<Character> keys = baseMap.keySet();
		for (Character ch : keys) {
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");
			}

		}
	}
}
