package com.algo.hacker.warm;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		Map<Character, Integer> map = new HashMap();
		char[] words = a.toCharArray();
		char[] wordsB = b.toCharArray();

		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				int count = map.get(words[i]);
				map.put(words[i], count + 1);
			} else {
				map.put(words[i], 1);
			}
		}
		boolean isValid = false;
		for (int i = 0; i < wordsB.length; i++) {
			if (map.containsKey(wordsB[i])) {
				int count = map.get(wordsB[i]);
				if (count == 0) {
					isValid = false;
					break;
				} else {
					isValid = true;
					count = count - 1;
					map.put(wordsB[i], count);
				}
			}
		}
		if (isValid) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		return isValid;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}