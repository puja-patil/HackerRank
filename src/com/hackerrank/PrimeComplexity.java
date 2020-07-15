package com.hackerrank;

import java.util.*;

public class PrimeComplexity {

	static boolean calculatePrime(int n) {
		boolean isPrime = true;
		if (n == 1) {
			isPrime = false;
		} else {
			for (int j = 2; j * j <= n; j++) {
				if (n % j == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		/* Enter your code here. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int i : arr) {
			System.out.println(calculatePrime(i) ? "Prime" : "Not Prime");
		}

		in.close();

	}
}
