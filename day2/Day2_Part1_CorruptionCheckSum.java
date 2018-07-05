package com.adventofcode.solution.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2_Part1_CorruptionCheckSum {
	public static void checkSum() throws IOException {
		FileReader file = new FileReader("/Users/birendra.ks/Desktop/spreadsheet.csv");
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
		int min, max = 0;
		min = Integer.parseInt(s[0]);
		for (int i = 1; i < s.length; i++) {
			if (min > Integer.parseInt(s[i])) {
				if (min > max) {
					max = min;
				}
				min = Integer.parseInt(s[i]);
			} else if (Integer.parseInt(s[i]) > min && Integer.parseInt(s[i]) > max) {
				max = Integer.parseInt(s[i]);
			}
		}
		return max - min;
	}

	public static void main(String[] args) {
		try {
			checkSum();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
