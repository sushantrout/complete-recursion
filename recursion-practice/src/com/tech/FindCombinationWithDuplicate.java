package com.tech;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCombinationWithDuplicate {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int array[] = { 1, 1, 1, 2, 2 };
		int index = 0;
		int target = 4;
		int length = array.length;
		ArrayList<Integer> currentOutput = new ArrayList<>();

		findCombination(index, array, result, length, target, currentOutput);
		HashSet<ArrayList<Integer>> hashSet = new HashSet<>(result);
		for (ArrayList<Integer> res : hashSet) {
			System.out.println(res);
		}
	}

	private static void findCombination(int index, int[] array, ArrayList<ArrayList<Integer>> result, int length,
			int target, ArrayList<Integer> currentOutput) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(currentOutput));
			return;
		}

		for (int i = index; i < length; i++) {
			if (i > index && array[index] == array[i]) {
				continue;
			} else if (array[i] > target) {
				return;
			}
			currentOutput.add(array[i]);
			findCombination(i + 1, array, result, length, target - array[i], currentOutput);
			currentOutput.remove(currentOutput.size() - 1);
		}
	}
}
