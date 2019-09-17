package com.algo.dayofProg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stock {

	/*
	 * Complete the 'maximumProfit' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * INTEGER_ARRAY price as parameter.
	 */

	public static long maximumProfit(List<Integer> price) {
		// Write your code here
		int maxIndexPrice = 0;
		int minIndexPrice = 1;
		int priceEnd = price.size() - 1;
		int profit = 0;
		while (minIndexPrice <= priceEnd) {
			int maxPrice = 0;

			for (int i = minIndexPrice; i <= priceEnd; i++) {
				if (price.get(i) > maxPrice) {
					maxPrice = price.get(i);
					maxIndexPrice = i;
				}
			}

			if (maxIndexPrice == minIndexPrice) {
				profit = profit - price.get(minIndexPrice);
			}

			int buyPriceTotal = 0;
			int totalStocks = 0;
			for (int i = minIndexPrice; i < maxIndexPrice; i++) {
				buyPriceTotal += price.get(i);
				totalStocks++;
			}
			profit = profit + totalStocks * price.get(maxIndexPrice) - buyPriceTotal;
			minIndexPrice = maxIndexPrice + 1;

		}
		
		if (profit < 0) {
			return 0;
		}
		return profit;
	}

	public static long getMaxProfit(int[] prices) {
		long profit = 0L;
		int maxSoFar = 0;

		for (int i = prices.length - 1; i > -1; i--) {
			if (prices[i] >= maxSoFar) {
				maxSoFar = prices[i];
			}
			profit = profit + maxSoFar - prices[i];
		}
		return profit;
	}

	public static long getMaxProfit1(int[] prices) {
		long profit = 0L;
		int maxSoFar = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] >= maxSoFar) {
				maxSoFar = prices[i];
			}
			profit = profit + maxSoFar - prices[i];
		}
		return profit;
	}

	public static void main(String[] args) throws IOException {
		List<Integer> price = new ArrayList<Integer>();
		price.add(4);
		price.add(1);
		price.add(2);
		price.add(3);
		//price.add(5);
		System.out.println(Stock.maximumProfit(price));
		int[] arr = new int[price.size()];
		// ArrayList to Array Conversion
		for (int i = 0; i < price.size(); i++)
			arr[i] = price.get(i);

		System.out.println(Stock.getMaxProfit(arr));
		System.out.println(Stock.getMaxProfit1(arr));
	}
}
