package com.tech;

import java.util.ArrayList;
import java.util.List;

public class FindAnyCombination {
	static int digits[] = { 1, 2 };
	static int stepCount = 6;

	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		getCombination(stepCount, "", result);

		for (String string : result) {
			System.out.println(string);
		}
	}

	private static void getCombination(int i, String currentCombination, List<String> result) {
		if(i == -1) {
			return;
		}
		if (currentCombination.length() == i) {
			result.add(currentCombination);
			return;
		}
		for (int digit : digits) {
			getCombination(i, currentCombination + digit, result);
		}
		result.add("\n\n\n");
		getCombination(i - 1, currentCombination, result);
	}
}
