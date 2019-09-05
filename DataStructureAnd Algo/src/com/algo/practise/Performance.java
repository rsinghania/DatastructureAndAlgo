package com.algo.practise;

public class Performance {
	public static void main(String[] args) {
		int ar[] = { 1,2,3,4,5,6};
		
		
		for (int i = 0; i < ar.length; i++) {
				System.out.println(ar[i]);
		} // O(n)
		
		System.out.println("Sum of number");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.println(ar[i]+ar[j]);
			}
		}
		//O(n^2)
	}
}