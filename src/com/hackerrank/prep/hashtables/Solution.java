package com.hackerrank.prep.hashtables;

import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.joining;

public class Solution {

	// Complete the freqQuery function below.
	static List<Integer> freqQuery(int[][] queries) {
		List<Integer> r = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

		for (int[] q : queries) {
			if (q[0] == 1) {
				map.put(q[1], map.getOrDefault(q[1], 0) + 1);
				freq.put(map.get(q[1]), q[1]);
			} else if (q[0] == 2 && map.getOrDefault(q[1], 0) > 0) {
					map.put(q[1], map.getOrDefault(q[1], 0) - 1);
					freq.put(map.get(q[1]), q[1]);
				
			} else if (q[0] == 3) {
				if (freq.get(q[1]) != null)
					r.add(1);
				else
					r.add(0);
			}
		}
		System.out.println(map);
		System.out.println(freq);
		return r;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		// List<List<Integer>> queries = new ArrayList<>();
		int[][] queries = new int[q][2];
		for (int i = 0; i < q; i++) {
			String[] query = bufferedReader.readLine().split(" ");
			queries[i][0] = Integer.parseInt(query[0]);
			queries[i][1] = Integer.parseInt(query[1]);
		}

		List<Integer> ans = freqQuery(queries);
		System.out.println(ans.stream().map(Object::toString).collect(joining("\n")));
//		bufferedWriter.write(ans.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
//		bufferedWriter.close();
	}
}
