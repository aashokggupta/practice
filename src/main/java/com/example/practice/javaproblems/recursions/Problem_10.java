package com.example.practice.javaproblems.recursions;

/**
 * Method to find sum till a given number
 * 
 * @author Ashok
 */
public class Problem_10 {
	
	/**
	 * Method to find sum of a given number 
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int findSum(int n) {
		if (n <= 0) return 0;
		if (n == 1) return 1;
		return n + findSum(n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(findSum(5));
	}

}
