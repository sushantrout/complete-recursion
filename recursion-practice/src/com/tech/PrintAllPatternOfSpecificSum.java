package com.tech;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPatternOfSpecificSum {
	private static List<List<Integer>> allOutput = new ArrayList<>();
	public static void main(String[] args) {
		int input[] = { 3, 2, 1 };
		List<Integer> output = new ArrayList<>();

		findPattern(0, input, output, input.length, 0, 3);
		
		allOutput.forEach(e -> {
			System.out.println(e);
		});
	}

	private static void findPattern(int index, int[] input, List<Integer> coutput, int length, int sum, int targetSum) {
		if(index >= length) {
			if(sum == targetSum) {
				allOutput.add(new ArrayList<Integer>(coutput));
			}
			return;
		}
		coutput.add(input[index]);
		findPattern(index + 1, input, coutput, length, sum + input[index], targetSum);
		coutput.remove(coutput.size() - 1);
		findPattern(index + 1, input, coutput, length, sum, targetSum);
	}
}
