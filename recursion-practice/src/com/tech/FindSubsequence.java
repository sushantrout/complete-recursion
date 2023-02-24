package com.tech;

import java.util.ArrayList;
import java.util.List;

public class FindSubsequence {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
		ArrayList<Integer> arrayList = new ArrayList<>();
		subsequence(0, array, arrayList, array.length);
	}

	private static void subsequence(int index, int[] array, List<Integer> output, int length) {
		if (index >= length) {
			if (output.size() == 0) {
				System.out.println("{}");
			}
			for (int i = 0; i < output.size(); i++) {
				System.out.print(output.get(i));
			}
			System.out.println();
			return;
		}
		output.add(array[index]);
		subsequence(index + 1, array, output, length);

		output.remove(output.size() - 1);
		subsequence(index + 1, array, output, length);
	}
}
