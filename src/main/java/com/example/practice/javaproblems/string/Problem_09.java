package com.example.practice.javaproblems.string;

/**
 * Given a string, reverse it's words and characters
 * 
 * @author Ashok
 */
public class Problem_09 {

	/**
	 * Method to reverse the words and characters
	 * => Traverse the string backwards
	 * 
	 * @param input
	 * @return
	 */
	public static String reverse(String input) {
		if (input == null || input.length() == 0) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			builder.append(input.charAt(i));
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Hello Ashok Malik"));
	}
	
}
