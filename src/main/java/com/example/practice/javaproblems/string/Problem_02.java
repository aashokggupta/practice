package com.example.practice.javaproblems.string;

/**
 * Reverse words in a Sentence
 * 
 * @author Ashok
 */
public class Problem_02 {

	/**
	 * Reverse words in a string 
	 * Approach : Split the word by space and then reverse 
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n) - I have inserted all words in builder
	 * 
	 * @param str
	 * @return {@link String}
	 */
	public static String reverseWords(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		String[] strArray = str.split("\\s");
		StringBuilder builder = new StringBuilder();
		for (int i = strArray.length - 1; i >= 0; i--) {
			builder.append(strArray[i] + " ");
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Hello World"));
	}

}
