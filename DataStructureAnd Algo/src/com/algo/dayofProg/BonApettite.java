package com.algo.dayofProg;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class BonApettite {

	// Complete the bonAppetit function below.
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int actualSum = 0;

		for (int i = 0; i < bill.size(); i++) {
			int itemAmount = bill.get(i);
			actualSum += itemAmount;
		}
		int perPerson = actualSum / 2;
		if (b > perPerson) {
			System.out.println(b - perPerson);
		} else if (b < perPerson) {
			System.out.println(perPerson - b);
		} else {
			System.out.println("Bon Appetit");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int b = Integer.parseInt(bufferedReader.readLine().trim());

		bonAppetit(bill, k, b);

		bufferedReader.close();
	}
}
