package com.hackerrank.prep.strings;

import java.io.*;
import java.util.*;

public class CommonSubstrings {

	// Complete the commonChild function below.
	static int commonChild(String s1, String s2) {
		String[] s1arr = s1.split("");
		String[] s2arr = s2.split("");
		int matrix[][] = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i <= s1arr.length; i++) {
			for (int j = 1; j <= s2arr.length; j++) {
				if (s1arr[i - 1].equals(s2arr[j - 1])) {
					matrix[i][j] = 1 + matrix[i - 1][j - 1];
				} else {
					matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
				}
			}
		}
		for (int i = 0; i <= s1arr.length; i++) {
			for (int j = 0; j <= s2arr.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		return matrix[s1.length()][s2.length()];
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s1 = scanner.nextLine();

		String s2 = scanner.nextLine();

		int result = commonChild(s1, s2);
		System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
