package com.hackerrank.prep.strings;

import java.io.*;
import java.util.*;

public class StringManipUsingJava8 {

	// Complete the isValid function below.
	static String isValid(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int isValid = 0;
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		System.out.println(map.values().stream().findFirst().orElse(0));
		int min = map.values().stream().findFirst().orElse(0);
		if (min == 1)
			min = map.values().stream().skip(1).findFirst().orElse(0);
		for (Integer i : map.values()) {
			if (min != i) {
				isValid++;
			}
		}
		return isValid > 1 ? "No" : "Yes";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = isValid(s);
		System.out.println(result);

		/*
		 * bufferedWriter.write(result); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
