package com.adventofcode.solution.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Entropy_Day4_Part1 {
	static int valid = 0;
	static int inValid = 0;

	public static void check() throws IOException {

		FileReader reader = new FileReader("/Users/birendra.ks/Desktop/day4.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String val;
		while ((val = bufferedReader.readLine()) != null) {
			valid += isvalid(val.split(" "));
		}
		bufferedReader.close();
	}

	private static int isvalid(String[] inputs) {
		boolean flag = false;
		for (int i = 0; i < inputs.length; i++) {
			for (int j = i + 1; j < inputs.length; j++) {
				if (inputs[i].equals(inputs[j])) {
					inValid++;
					flag = true;
					return 0;
				}
			}
		}
		if (!flag) {
			valid = 1;
		}
		return valid;
	}

	public static void main(String[] args) throws IOException {
		check();
		System.out.println("Invalid: " + inValid + "\t Valid: " + valid);
	}
}
