package com.tech;

public class RecurssionTest2 {
	public static void main(String[] args) {
		int i = 0;
		int n = 5;
		printNameUsingNTimes(i, n);
	}

	private static void printNameUsingNTimes(int i, int n) {
		if(i == n) {
			return;
		}
		System.out.println("Sushant" + i);
		printNameUsingNTimes(i+1, n);
	}
}
