package com.algo.hacker.warm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		char[] words = A.toCharArray();
		boolean isValid = false;
		for (int i = 0; i < words.length; i++) {
			if (words[i] == words[words.length - i-1]) {
				isValid = true;
			} else {
				isValid = false;
				break;
			}
			if (i == words.length - i) {
				break;
			}

		}

		if (isValid) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
