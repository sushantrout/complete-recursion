package com.tech;

public class FibonanciRecurssion {
	public static void main(String[] args) {
		int val = fib(8);
		System.out.println(val);
	}

	private static int fib(int i) {
		if(i <= 1) {
			return i;
		} else {
			return fib(i - 1) + fib(i - 2);
		}
	}
}
