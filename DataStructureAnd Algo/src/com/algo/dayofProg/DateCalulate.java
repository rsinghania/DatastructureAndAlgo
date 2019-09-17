package com.algo.dayofProg;
public class DateCalulate {

	public static void main(String args[]) {
		System.out.println(dayOfProgrammer(1800));
	}

	static String dayOfProgrammer(int year) {

		if (year == 1918) {
			return "26.09.1918";
		} else if ((year <= 1917) && (year % 4 == 0) || ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {
			return "12.09.".concat(String.valueOf(year));
		} else {
			return "13.09.".concat(String.valueOf(year));
		}

	}
}
