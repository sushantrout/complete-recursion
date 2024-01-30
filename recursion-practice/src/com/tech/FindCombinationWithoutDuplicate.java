package com.tech;

import java.util.ArrayList;
import java.util.List;

public class FindCombinationWithoutDuplicate {
	public static void main(String[] args) {
		int array[] = { 1, 1, 1, 2, 2 };
		List<List<Integer>> output = new ArrayList<>();
		int target = 4;
		List<Integer> currentOutput = new ArrayList<>();
		findNotDuplicateCombination(0, target, array, output, currentOutput);
		for (List<Integer> res : output) {
			System.out.println(res);
		}
	}

	private static void findNotDuplicateCombination(int index, int target, int[] array, List<List<Integer>> output,
			List<Integer> currentOutput) {
		if (target == 0) {
			output.add(new ArrayList<Integer>(currentOutput));
			return;
		}

		for (int startIndex = index; startIndex < array.length; startIndex++) {
			if(startIndex > index && array[startIndex] == array[startIndex - 1]) {
				continue;
			}
			if(target < array[startIndex]) {
				break;
			}
			currentOutput.add(array[startIndex]);
			findNotDuplicateCombination(startIndex + 1, target - array[startIndex], array, output, currentOutput);
			currentOutput.remove(currentOutput.size() - 1);
		}
	}
}
