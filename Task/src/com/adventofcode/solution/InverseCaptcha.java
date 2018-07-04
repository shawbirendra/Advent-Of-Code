package com.adventofcode.solution;

public class InverseCaptcha {

	public static void checkSum(String input) {
		int total = 0;
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (i == c.length - 1) {
				if (c[i] == c[0]) {
					int nn = (int) c[i] - 48;
					total = total + nn;
				}

			} else {
				if (c[i] == c[i + 1]) {
					int nn = (int) c[i] - 48;
					total = total + nn;
				}
			}
		}
		 System.out.println(total);

	}

	public static void main(String[] args) {
		checkSum("1122");
	}
}
