package com.hackerrank.prep.arrays;

import java.io.*;
import java.util.*;

public class SortConsecutiveArrMinSwaps {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int swap = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] - (i + 1) != 0) {
				int tmp = arr[i];
				arr[i] = arr[tmp - 1];
				arr[tmp - 1] = tmp;
				swap++;
			}
			/*
			 * for (int j = i; j < arr.length; j++) { if (arr[i] > arr[j]) { int tmp =
			 * arr[i]; arr[i] = arr[j]; arr[j] = tmp; swap++; } }
			 */

			/*
			 * for (int j = i; j < arr.length; j++) { if (arr[j] - (j + 1) != 0) { int tmp =
			 * arr[j]; arr[j] = arr[tmp - 1]; arr[tmp - 1] = tmp; swap++; } }
			 */

		}
		return swap;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);
		System.out.println(res);
		/*
		 * bufferedWriter.write(String.valueOf(res)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
