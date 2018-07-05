package com.adventofcode.solution.day1;

public class Day1_Part2_InverseCaptcha2 {

	public static void checkSum(String input) {
		int total = 0;
		char[] c = input.toCharArray();
		int shift = c.length / 2;

		for (int i = 0; i < c.length; i++) {
			int pos = i + shift;
			if (pos > c.length - 1) {
				pos = i - shift;
				if (c[i] == c[pos]) {
					total = total + c[i] - 48;
				}
			} else {
				if (c[i] == c[pos]) {
					total = total + c[i] - 48;
				}
			}

		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		checkSum(
				"");
	}
}
