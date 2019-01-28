package com.example.practice.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxConsecutiveBinaryNums {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println(maxConsecutiveOnes(n));
		scanner.close();
	}

	private static int maxConsecutiveOnes(int x) {
		// Initialize result
		int count = 0;

		// Count the number of iterations to
		// reach x = 0.
		while (x != 0) {
			// This operation reduces length
			// of every sequence of 1s by one.
			x = (x & (x << 1));

			count++;
		}

		return count;
	}
}
