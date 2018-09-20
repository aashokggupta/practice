package com.example.practice.ds.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 100, 200, 350 };

		System.out.println("Index of 6 : " + binarySearch(a, 6));
		System.out.println("Index of 350 : " + binarySearch(a, 350));
		System.out.println("Index of 4 : " + binarySearch(a, 4));
		System.out.println("Index of 12212 : " + binarySearch(a, 12212));
	}

	static int binarySearch(int[] a, int n) {
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (a[mid] == n) {
				return mid;
			} else if (a[mid] < n) {
				first = mid + 1;
			} else if (a[mid] > n) {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		return -1;
	}
}
