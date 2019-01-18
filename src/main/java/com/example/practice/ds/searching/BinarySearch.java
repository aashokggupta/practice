package com.example.practice.ds.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 100, 200, 350 };

		System.out.println("Index of 6 : " + binarySearch(a, 6));
		System.out.println("Index of 350 : " + binarySearch(a, 350));
		System.out.println("Index of 4 : " + binarySearch(a, 4));
		System.out.println("Index of 12212 : " + binarySearch(a, 12212));
		
		System.out.println(a.length);
		System.out.println("Index of 6 : " + recursiveBinarySearch(a, 6,0,(a.length-1)));
		System.out.println("Index of 350 : " + recursiveBinarySearch(a, 350,0,(a.length-1)));
		System.out.println("Index of 4 : " + recursiveBinarySearch(a, 4,0,(a.length-1)));
		System.out.println("Index of 12212 : " + recursiveBinarySearch(a, 12212,0,(a.length-1)));
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
	
	static int recursiveBinarySearch(int[] a, int data, int first, int last) {
		if(first>last) {
			return -1;
		}
		
		int mid = (first+last)/2;
		
		if(a[mid] == data){
			return mid;
		}
		
		if(a[mid] > data) {
			return recursiveBinarySearch(a,data,first,mid-1);
		} else{
			return recursiveBinarySearch(a,data,mid+1,last);
		}  
	}
}
