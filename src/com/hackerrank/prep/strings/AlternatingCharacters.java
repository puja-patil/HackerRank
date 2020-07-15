package com.hackerrank.prep.strings;

import java.io.*;
import java.util.*;

public class AlternatingCharacters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length() - 1; i++) {

			while (sb.charAt(i) == sb.charAt(i + 1)) {
				count++;
				sb.deleteCharAt(i + 1);
				if (sb.length() == 1 || sb.length() - 1 < i + 1)
					break;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);
			System.out.println(result);

			/*
			 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
			 */
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
