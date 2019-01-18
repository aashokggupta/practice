package com.example.practice.test;

import java.util.Random;

public class RandomTest {
	public static void main(String args[]) {
	Random rand = new Random();
	int face = 1+rand.nextInt(6);
	System.out.println(face);
	}
}
