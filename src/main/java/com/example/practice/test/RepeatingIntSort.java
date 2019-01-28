package com.example.practice.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepeatingIntSort {
	public static void main(String args[]) {
		Integer[] arr = new Integer[]{3,2,2,2,4,1,5,1,6,4,3,3};
		
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {
			if(null == map.get(arr[i])) {
				map.put(arr[i],1);
			} else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		map.entrySet().stream().forEach(i -> System.out.println(i.getValue()));
		
		System.out.println(Stream.of(arr).collect(Collectors.averagingInt(Integer::intValue))+"");
		
		System.out.println(Stream.of(arr).mapToInt(i-> i).average().orElse(0.0));
		
		int[] arr1 = new int[]{3,2,2,2,4,1,5,1,6,4,3,3};
		
//		System.out.println(IntStream.of(arr1).collect(Collectors.averagingInt(i -> i))+"");
		
		System.out.println(IntStream.of(arr1).average().orElse(0.0));
	}
}
