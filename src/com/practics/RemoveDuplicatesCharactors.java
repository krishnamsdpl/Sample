package com.practics;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharactors {
	public static void main(String[] args) {
        String str = "krishnajj";
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            linkedHashSet.add(str.charAt(i));
        }
        for(Character c:linkedHashSet){
            System.out.println(c);
        }

	}
}
