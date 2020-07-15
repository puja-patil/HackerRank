package com.hackerrank;

import java.io.*;
import java.util.*;

public class RecursiveFactorial {

	// Complete the factorial function below.
	static int factorial(int n) {
		// int x = n*(n-1);
		if (n == 1) {

			return n;
		} else {
			return n * factorial(n - 1);
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int n = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 */

		int result = factorial(3);
		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
