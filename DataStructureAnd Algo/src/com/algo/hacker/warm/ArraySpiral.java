package com.algo.hacker.warm;

public class ArraySpiral {

	public static void main(String[] args) {

		System.out.println(kangaroo(0, 1, 2, 3));

	}

	// Complete the kangaroo function below.
	public static String kangaroo(int x1, int v1, int x2, int v2) {

		if (x2 > x1 && v2 > v1 || x1 > x2 && v1 > v2) {
			return "NO";
		} else {
			int count = 0;
			int jumpA = x1;
			int jumpB = x2;
			while (jumpA != jumpB) {
				jumpA = jumpA + v1;
				jumpB = jumpB + v2;
				count++;
				if (count > 1000) {
					break;
				}
			}
			if (jumpA == jumpB) {
				return "YES";
			} else {
				return "NO";
			}
		}
	}

	static String kangaroo1(int x1, int v1, int x2, int v2) {

		if (v1 > v2) {

			int remainder = (x1 - x2) % (v2 - v1);

			if (remainder == 0) {
				return "YES";
			}
		}
		return "NO";

	}
}
