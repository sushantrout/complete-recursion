package com.tech;

public class ParameterisedTest {
	public static void main(String[] args) {

		int n = 5;
		sumOfNumber(n, 0);
	}

	private static void sumOfNumber(int i, int sum) {
		if (i == 0) {
			System.out.println(sum);
			return;
		}
		sumOfNumber(i - 1, sum + i);
	}
}
