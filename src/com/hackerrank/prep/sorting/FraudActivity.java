package com.hackerrank.prep.sorting;

import java.io.*;
import java.util.*;

public class FraudActivity {

	// Complete the activityNotifications function below.
	static int activityNotifications(int[] expenditure, int d) {
		int count = 0;
		for (int i = 0; i < expenditure.length - d; i++) {
			int[] arr = Arrays.copyOfRange(expenditure, i, i + d);
			Arrays.sort(arr);

			if (expenditure[i + d] >= 2 * (arr[d / 2])) {
				count++;
			}

		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] expenditure = new int[n];

		String[] expenditureItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int expenditureItem = Integer.parseInt(expenditureItems[i]);
			expenditure[i] = expenditureItem;
		}

		int result = activityNotifications(expenditure, d);
		System.out.println(result);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
