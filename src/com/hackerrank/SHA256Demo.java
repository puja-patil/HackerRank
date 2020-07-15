package com.hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.xml.bind.DatatypeConverter;

public class SHA256Demo {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String val = in.nextLine();
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(val.getBytes());
			byte[] digest = md.digest();
			String hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			/*
			 * for(byte b : digest) { System.out.printf("%02x",b); }
			 */
			System.out.println(hash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

	}
}