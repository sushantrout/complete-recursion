package com.tech;

import java.util.ArrayList;

public class FindPermutationOFAnArray {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int array[] = { 1, 2, 3 };
		int index = 0;
		int length = array.length;
		ArrayList<Integer> currentOutput = new ArrayList<>();

		findPermutation(index, array, result, length, currentOutput);
		for (ArrayList<Integer> res : result) {
			System.out.println(res);
		}
	}

	private static void findPermutation(int index, int[] array, ArrayList<ArrayList<Integer>> result, int length,
			ArrayList<Integer> currentOutput) {
		if (index == length) {
			currentOutput = new ArrayList<Integer>();
			for (int i = 0; i < array.length; i++) {
				currentOutput.add(array[i]);
			}
			result.add(new ArrayList<Integer>(currentOutput));
			return;
		}

		for (int i = index; i < length; i++) {
			swap(i, index, array);
			findPermutation(index + 1, array, result, length, currentOutput);
			swap(i, index, array);
		}
	}

	private static void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
