package com.hackerrank.prep.strings;

import java.io.*;
import java.util.*;

public class SpecialStrings {

	// Complete the substrCount function below.
	static long substrCount(int n, String s) {
		long count = 0;
		for (int i = 0; i < s.length(); i++) {
			int j = i + 1;
			while (j < s.length() + 1) {
				StringBuilder sub = new StringBuilder(s.substring(i, j));
				if (sub.length() % 2 == 1) {
					sub.deleteCharAt(sub.length() / 2);
				}
				if (sub.chars().allMatch(x -> x == sub.charAt(0))) {
					count++;
				}
				j++;
			}
		}
		return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		// scanner.next();
		String s = scanner.nextLine();

		long result = substrCount(n, s);
		System.out.println(result);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
