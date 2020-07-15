package com.hackerrank.prep.sorting;

import java.io.*;
import java.util.*;

public class CountInversionsUsingMergeSort {
	// Complete the countInversions function below.
	static long countInversions(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(merge(arr, 0L));
		for (int i : arr) {
			System.out.print(i + " ");
		}

		return merge(arr, 0L);
	}

	static long merge(int[] arr, long num) {
		if (arr.length > 1) {
			num = 0L;
			int[] l = Arrays.copyOfRange(arr, 0, arr.length / 2);
			int[] r = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

			num = merge(l, num) + merge(r, num);
			int i = 0, j = 0, k = 0, m = l.length, n = r.length;
			while (i < m && j < n) {
				if (l[i] > r[j]) {
					arr[k] = r[j];
					j++;
					num += m - i;
				} else {
					arr[k] = l[i];
					i++;
				}
				k++;
			}
			while (i < m) {
				arr[k] = l[i];
				i++;
				k++;
			}
			while (j < n) {
				arr[k] = r[j];
				j++;
				k++;
			}
		}
		return num;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
//			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] arr = new int[n];
			scanner.nextLine();

			String[] arrItems = scanner.nextLine().split(" ");
//			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int arrItem = Integer.parseInt(arrItems[i]);
				arr[i] = arrItem;
			}

			long result = countInversions(arr);
			System.out.println();
			System.out.println(result);

//			bufferedWriter.write(String.valueOf(result));
//			bufferedWriter.newLine();
		}

//		bufferedWriter.close();

		scanner.close();
	}
}
