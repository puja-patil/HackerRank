package com.hackerrank.prep.strings;

import java.io.*;
import java.util.*;

public class MakeAnagrams {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {

		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == bArr[j]) {
					// System.out.println(a+"-"+bArr[j]);
					aArr[i] = ' ';
					bArr[j] = ' ';
					break;
				}
			}
		}

		/*
		 * StringBuilder fsb = new StringBuilder(a.toLowerCase()); StringBuilder ssb =
		 * new StringBuilder(b.toLowerCase()); StringBuilder fsb1 = new
		 * StringBuilder(a.toLowerCase()); StringBuilder ssb1 = new
		 * StringBuilder(b.toLowerCase());
		 * 
		 * for (int i = 0; i < fsb.length(); i++) { for (int j = 0; j < ssb.length();
		 * j++) { if (fsb.charAt(i) == ssb1.charAt(j)) {
		 * 
		 * fsb1.setCharAt(i, ' '); ssb1.setCharAt(j, ' '); break; } } } a =
		 * fsb1.toString().replaceAll("\\s+", ""); b =
		 * ssb1.toString().replaceAll("\\s+", ""); return a.length() + b.length();
		 */

		return String.valueOf(aArr).replace(" ", "").length() + String.valueOf(bArr).replace(" ", "").length();

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);
		System.out.println(res);
		/*
		 * bufferedWriter.write(String.valueOf(res)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
