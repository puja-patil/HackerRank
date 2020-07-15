package com.hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingMaps {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		Map<String, String> phonebook = new HashMap<String, String>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			// System.out.println(in.next() + "-" + in.next());

			phonebook.put(in.next(), in.next());
		}

		while (in.hasNext()) {
			String s = in.next();
			if (phonebook.containsKey(s)) {
				System.out.println(s + "=" + phonebook.get(s));
			} else {
				System.out.println("Not Found");
			}
		}
		in.close();
	}

}
