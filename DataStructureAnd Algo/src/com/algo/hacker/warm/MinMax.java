package com.algo.hacker.warm;
public class MinMax {

	public static void miniMaxSum(int[] a) {
		int max = 0, min = 1000000001, sum = 0;

		for (int i = 0; i < 5; i++) {
			if (a[i] > max) {
				max = a[i];
			}

			if (a[i] < min) {
				min = a[i];
			}

			sum = sum + a[i];
		}
		System.out.print((sum - max) + " " + (sum - min));
	}
}
