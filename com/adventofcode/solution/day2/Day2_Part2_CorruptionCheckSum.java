package com.adventofcode.solution.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Day2_Part2_CorruptionCheckSum {
	public static void checkSum() throws IOException {
		FileReader file = new FileReader("/Users/birendra.ks/Desktop/spreadsheet2.csv");
		BufferedReader reader = new BufferedReader(file);
		String line;
		int output = 0;
		while ((line = reader.readLine()) != null) {
			output += addRemainderOfZero(line.split(";"));
		}
		System.out.println(output);
		reader.close();
		file.close();

	}

	public static int addRemainderOfZero(String[] s) {
		Collections.sort(Arrays.asList(s));
		int quotient = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {

				if (i == j)
					continue;

				if (Integer.parseInt(s[j]) % Integer.parseInt(s[i]) == 0) {
					quotient = Integer.parseInt(s[j]) / Integer.parseInt(s[i]);
					break;
				}

			}

		}
		return quotient;
	}

	public static void main(String[] args) {
		try {
			checkSum();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
