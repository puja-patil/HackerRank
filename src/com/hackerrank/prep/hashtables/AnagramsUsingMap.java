package com.hackerrank.prep.hashtables;

import java.io.*;
import java.util.*;

public class AnagramsUsingMap {

	// Complete the sherlockAndAnagrams function below.
	static int sherlockAndAnagrams(String s) {
		int count = 0;
		// StringBuilder sb = new StringBuilder(s);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String subString = s.substring(i, j);
				char[] c = subString.toCharArray();
				Arrays.sort(c);
				String sorted = new String(c);
				if (map.containsKey(sorted)) {
					map.put(sorted, map.get(sorted) + 1);
				} else {
					map.put(sorted, 1);
				}

			}
		}

		System.out.println(map);
		for (int x : map.values()) {
			count += x * (x - 1) / 2;
		}
		
		return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = sherlockAndAnagrams(s);
			System.out.println(result);
//			bufferedWriter.write(String.valueOf(result));
//			bufferedWriter.newLine();
		}

//		bufferedWriter.close();

		scanner.close();
	}
}
