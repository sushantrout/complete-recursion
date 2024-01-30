package com.tech;

import java.util.ArrayList;
import java.util.List;

public class FindCominationDemo {
	public static void main(String[] args) {
		int array[] = { 2, 3, 6, 7, 1 };
		List<List<Integer>> output = new ArrayList<>();
		int target = 7;
		List<Integer> currentOutput = new ArrayList<>();
		findCombination(0, target, array, output, currentOutput);
		for (List<Integer> res : output) {
			System.out.println(res);
		}
	}

	static void findCombination(int index, int target, int[] array, List<List<Integer>> output, List<Integer> currentOutput) {
		
		if(index == array.length) {
			if(target == 0) {
				output.add(new ArrayList<>(currentOutput));
			}
			return;
		}
		
		if(array[index] <= target) {
			currentOutput.add(array[index]);
			findCombination(index, target - array[index], array, output, currentOutput);
			currentOutput.remove(currentOutput.size() - 1);
		}
		findCombination(index + 1, target, array, output, currentOutput);
	}
}
