package com.algo.hacker.warm;

public class MergeSortedArray {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		int[] numbers1 = { 1, 2, 13, 24, 35 };
		int[] numbers2 = { 2, 11, 31, 43, 55 };
		String s="aaa";
		
		int i = 0, j = 0;
		int lengthA = numbers1.length;
		int lengthB = numbers2.length;

		while (i < lengthA || j < lengthB) {
			if (i >= lengthA) {
				System.out.println(numbers2[j]);
				j++;
			} else if (j >= lengthB) {
				System.out.println(numbers1[i]);
				i++;
			} else {
				if (numbers1[i] < numbers2[j]) {

					System.out.println(numbers1[i]);
					i++;
				} else {
					System.out.println(numbers2[j]);

					j++;
				}
			}

		}
	}
}
