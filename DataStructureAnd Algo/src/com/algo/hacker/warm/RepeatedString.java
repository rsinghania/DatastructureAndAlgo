package com.algo.hacker.warm;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		long count = 0;

		if (s.length() == 1 && s.charAt(0) == 'a') {
			return n;
		}
		for (char c : s.toCharArray()) {
			if (c == 'a') {
				count++;
			}
		}

		long factor = n/s.length();
		long rem = n%s.length();
		count = factor * count;
		for (int i = 0; i < rem; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.println(repeatedString("aba", 10));
	}
}
