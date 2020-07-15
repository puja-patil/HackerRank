package com.hackerrank.prep.sorting;

import java.io.*;
import java.util.*;

public class MergeSort {

	// Complete the countInversions function below.
	static long countInversions(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		return 0L;
	}

	static void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			mergeSort(arr, l, m, r);
		}
	}

	static void mergeSort(int[] arr, int l, int m, int r) {
		/*
		 * int[] lArr = Arrays.copyOfRange(arr, l, m + 1); int[] rArr =
		 * Arrays.copyOfRange(arr, m + 1, r + 1);
		 */
		int x = m - l + 1;
		int y = r - m;
		int[] lArr = new int[x];
		int[] rArr = new int[y];
		for (int i = 0; i < x; ++i) {
			lArr[i] = arr[i + l];
		}
		for (int j = 0; j < y; ++j) {
			rArr[j] = arr[m + j + 1];
		}

		int i = 0, j = 0, k = 0;
		while (i < lArr.length && j < rArr.length) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		while (i < x) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while (j < y) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
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

//			long result = countInversions(arr);
		//	System.out.println(result);

//			bufferedWriter.write(String.valueOf(result));
//			bufferedWriter.newLine();
		}

//		bufferedWriter.close();

		scanner.close();
	}
}
