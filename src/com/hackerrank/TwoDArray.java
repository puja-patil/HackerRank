package com.hackerrank;

import java.util.*;

public class TwoDArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i + "" + j);
				sum = 0;

				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						System.out.print((i + x) + "" + (j + y) + " ");
						// System.out.print(arr[i + x][j + y]+" ");
						if ((x == 1 && y == 0) || (x == 1 && y == 2)) {
							continue;
						}
						sum += arr[i + x][j + y];
					}
					System.out.println();

				}
				System.out.println("sum" + sum);
				if (max < sum) {
					max = sum;
				}

			}

		}
		System.out.println(max);

		scanner.close();
	}
}
