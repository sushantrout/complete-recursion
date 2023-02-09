package com.tech;

public class RecursionWithReturnOneValue {
	public static void main(String[] args) {
		int n = 5;

		int sum = getSumOfNumberOfValue(n, 0);
		System.out.println(sum);
	}

	private static int getSumOfNumberOfValue(int n, int sum) {
		if (n == 0) {
			return 0;
		}
		return n + getSumOfNumberOfValue(n - 1, sum);
	}
}
