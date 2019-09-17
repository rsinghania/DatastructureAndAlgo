package com.algo.dayofProg;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class BirthdayBar {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {

		Map<Integer, Integer> barMap = new HashMap();
		for (Integer bar : s) {
			if (barMap.containsKey(bar)) {
				int count = barMap.get(bar);
				barMap.put(bar, count + 1);
			} else {
				barMap.put(bar, 1);
			}
		}

		System.out.print(barMap);
		int finalCount = 0;
		for (Integer bar : s) {
			if (m == 1) {
				if (barMap.containsKey(d)) {
					int count = barMap.get(d);
					if (count > 0) {
						finalCount++;
					}
					barMap.put(d, count - 1);
				}
			} else {
				int diff = d - bar;
				barMap.put(bar, barMap.get(bar) - 1);
				if (barMap.containsKey(diff)) {
					int count = barMap.get(diff);
					if (count > 0) {
						finalCount++;
					}
					barMap.put(diff, count - 1);
				}
			}
		}
		System.out.print(barMap);
		System.out.println(finalCount);
		return finalCount;
	}

	public static void main(String args[]) {
		Integer[] s = { 1, 4 };
		List<Integer> s1 = Arrays.asList(s);
		birthday(s1, 4, 1);

	}
}
