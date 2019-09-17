package com.algo.hacker.warm;

import java.io.IOException;
import java.util.Scanner;

public class JumpCloud {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int jump = 0;
		int i = 0;
		while (i < c.length - 1) {
			if (i == c.length - 2) {
				i++;
				jump++;
			} else if (c[i + 1] == 1) {
				i = i + 2;
				jump++;
			} else if (c[i + 1] == 0 && c[i + 2] != 1) {
				i = i + 2;
				jump++;
			} else {
				i = i + 1;
				jump++;
			}
		}
		return jump;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] c = { 0, 0, 0, 1, 0, 0 };

		System.out.println(jumpingOnClouds(c));

		scanner.close();
	}
}
