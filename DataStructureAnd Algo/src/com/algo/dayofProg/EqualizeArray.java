package com.algo.dayofProg;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EqualizeArray {

	// Complete the equalizeArray function below.
	static int equalizeArray(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (countMap.containsKey(arr[i])) {
				int count = countMap.get(arr[i]);
				countMap.put(arr[i], count + 1);
			} else {
				countMap.put(arr[i], 1);
			}
		}
		System.out.println(Collections.max(countMap.values()));
		
		int max = 0;
		int deletion = 0;
		for (Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > max) {
				deletion += max;
				max = entry.getValue();
			} else {
				deletion+=entry.getValue();
			}
		}
		
		return deletion;

	}

	public static void main(String[] args) throws IOException {
		int[] arr = { 1, 2, 3, 1, 2, 3, 3, 3 };

		System.out.println(equalizeArray(arr));

	}
}
