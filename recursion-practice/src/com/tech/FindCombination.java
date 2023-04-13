package com.tech;

import java.util.ArrayList;

public class FindCombination {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int array[] = { 2,3,6,7 };
		int index = 0;
		int length = array.length;
		int target = 7;
		ArrayList<Integer> currentOutput = new ArrayList<>();

		findCombination(index, array, result, length, target, currentOutput);
		for (ArrayList<Integer> res : result) {
			System.out.println(res);
		}
	}

	private static void findCombination(int index, int[] array, ArrayList<ArrayList<Integer>> result, int length,
			int target, ArrayList<Integer> currentOutput) {
		if (index == length) {
			if (target == 0) {
				result.add(new ArrayList<Integer>(currentOutput));
			}
			return;
		}

		if (array[index] <= target) {
			currentOutput.add(array[index]);
			findCombination(index, array, result, length, target - array[index], currentOutput);
			currentOutput.remove(currentOutput.size() - 1);
		}
		findCombination(index + 1, array, result, length, target, currentOutput);
	}
}
