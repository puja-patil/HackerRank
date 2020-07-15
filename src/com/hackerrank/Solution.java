package com.hackerrank;

import java.util.*;

public class Solution {
	static int getNumber(int n, int k) {
		if ((k | k - 1) > n && k % 2 == 0) {
			return k - 2;
		} else {
			return k - 1;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);
			int result = getNumber(n, k);
			System.out.println(result);
		}

		scanner.close();
	}
}
