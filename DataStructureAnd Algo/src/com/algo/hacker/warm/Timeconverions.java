package com.algo.hacker.warm;

public class Timeconverions {

	public static void main(String arss[]) {
		System.out.println(timeConversion("12:05:01PM"));
	}

	public static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		System.out.println(1/2);
		System.out.println(5/2);
		String amPm = s.substring(8, 10);
		String[] time = s.substring(0, 8).split(":");
		StringBuffer stf = new StringBuffer();
		switch (amPm) {
		case "PM":
			if (Integer.parseInt(time[0]) == 12) {
				stf.append("12").append(":").append(time[1]).append(":").append(time[2]);
			} else {
				stf.append(Integer.parseInt(time[0]) + 12).append(":").append(time[1]).append(":").append(time[2]);
			}

			break;
		case "AM":
			if (Integer.parseInt(time[0]) == 12 && Integer.parseInt(time[2]) == 00 && Integer.parseInt(time[1]) == 00) {
				stf.append("00").append(":").append("00").append(":").append("00");
			} else if (Integer.parseInt(time[0]) == 12 && Integer.parseInt(time[2]) > 00) {
				stf.append("00").append(":").append(time[1]).append(":").append(time[2]);
			} else {
				stf.append(time[0]).append(":").append(time[1]).append(":").append(time[2]);
			}
			break;
		}
		return stf.toString();

	}

}
