package com.tech;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPatternOfSpecificSumV2 {
	private static List<List<Integer>> allOutput = new ArrayList<>();
	public static void main(String[] args) {
		int input[] = { 3, 2, 1 };
		List<Integer> output = new ArrayList<>();

		findPattern(0, input, output, input.length, 0, 3);
		
		allOutput.forEach(e -> {
			System.out.println(e);
		});
	}

	private static boolean findPattern(int index, int[] input, List<Integer> coutput, int length, int sum, int targetSum) {
		if(index >= length) {
			if(sum == targetSum) {
				allOutput.add(new ArrayList<Integer>(coutput));
				return true;
			}
			return false;
		}
		coutput.add(input[index]);
		if(findPattern(index + 1, input, coutput, length, sum + input[index], targetSum)) {
			return true;
		}
		coutput.remove(coutput.size() - 1);
		if(findPattern(index + 1, input, coutput, length, sum, targetSum)) {
			return true;
		}
		return false;
	}
}
