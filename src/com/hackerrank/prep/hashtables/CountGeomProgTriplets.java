package com.hackerrank.prep.hashtables;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class CountGeomProgTriplets {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		HashMap<Long, Long> for2 = new HashMap<Long, Long>();
		HashMap<Long, Long> for3 = new HashMap<>();
		long count = 0L;
		for (Long i : arr) {
			count += for3.getOrDefault(i, 0L);
			if (for2.containsKey(i)) {
				for3.put(i * r, for3.getOrDefault(i * r, 0L) + for2.get(i));
			}
			for2.put(i * r, for2.getOrDefault(i * r, 0L) + 1);
		}
		System.out.println(for2);
		System.out.println(for3);
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		// int n = Integer.parseInt(nr[0]);

		long r = Long.parseLong(nr[1]);

		List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		long ans = countTriplets(arr, r);
		System.out.println(ans);

//        bufferedWriter.write(String.valueOf(ans));
//        bufferedWriter.newLine();

		bufferedReader.close();
//        bufferedWriter.close();
	}
}
