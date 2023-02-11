package com.tech;

public class SubsetSumTest {
	public static void main(String[] args) {
		int[] subset = { 3, 1, 2 };

		int length = subset.length;
		int startIndex = 0;
		int sum = 0;

		findSumOfSubset(subset, length, startIndex, sum);
	}

	private static void findSumOfSubset(int[] subset, int length, int startIndex, int sum) {
		if (startIndex == length) {
			System.out.println(sum);
			return;
		} else {
			findSumOfSubset(subset, length, startIndex + 1, sum + subset[startIndex]);
			findSumOfSubset(subset, length, startIndex + 1, sum);
		}
	}
}
