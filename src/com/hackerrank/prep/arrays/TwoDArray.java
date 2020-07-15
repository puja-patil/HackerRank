package com.hackerrank.prep.arrays;

import java.io.*;
import java.util.*;

public class TwoDArray {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + 
						arr[i + 1][j + 1] +
						arr[i + 2][j]+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				
				System.out.println("i-" + i + "j-" + j);
				/*
				 * for (int x = 0; x < 3; x++) { for (int y = 0; y < 3; y++) {
				 * System.out.print(arr[x + i][y + j] + " "); if (x == 1 && x != y) { continue;
				 * } sum += arr[x + i][y + j]; } System.out.println(); }
				 */
				if (max < sum) {
					max = sum;
				}
			}
		}

		return max;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);
		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
