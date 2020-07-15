package com.hackerrank.prep.hashtables;

import java.util.*;

public class UsingHashTables {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		Hashtable<String, Integer> mag = new Hashtable<String, Integer>();
		for (String i : magazine) {
			mag.put(i, mag.getOrDefault(i, 0) + 1);
		}
		for (String i : note) {
			if (mag.get(i) != null && mag.get(i) != 0) {
				mag.put(i, mag.get(i) - 1);
			} else {
				System.out.println("No");
				return;
			}

		}
		System.out.println(mag);
		System.out.println("Yes");

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
