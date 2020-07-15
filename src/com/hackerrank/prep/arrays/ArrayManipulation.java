package com.hackerrank.prep.arrays;

import java.io.*;
import java.util.*;

public class ArrayManipulation {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		/*
		 * long[] arr = new long[n]; long max = Long.MIN_VALUE;
		 * 
		 * for (long i : arr) { i = 0; }
		 * 
		 * System.out.println(queries.length); for (int i[] : queries) { int a = i[0];
		 * int b = i[1]; int k = i[2]; for (int j = a - 1; j <= b - 1; j++) { arr[j] +=
		 * k; if (max < arr[j]) { max = arr[j]; } }
		 * 
		 * }
		 */
		SortedMap<Integer, Long> map = new TreeMap<>();

		for (int[] q : queries) {
			int start = q[0], end = q[1], k = q[2];
			map.put(start, map.getOrDefault(start, (long) 0) + k);
			map.put(end + 1, map.getOrDefault((end + 1), (long) 0) - k);
		}

		long maxNum = 0, x = 0;
		for (long v : map.values()) {
			x += v;
			maxNum = Math.max(maxNum, x);
		}
		return maxNum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		// File file = new File("C:\\Users\\ppp915369\\Desktop\\test.txt");

		// BufferedReader br = new BufferedReader(new FileReader(file));
		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);
		System.out.println(result);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
