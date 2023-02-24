package com.tech;

import java.util.ArrayList;
import java.util.List;

public class SubsetSecondApproach {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
		ArrayList<Integer> arrayList = new ArrayList<>();
		subsequence(0, array, arrayList, array.length);
	}

	private static List<Integer>[] subsequence(int i, int[] array, ArrayList<Integer> arrayList, int length) {
		if(i >= length ) {
			ArrayList<Integer> out = new ArrayList<>();
			List[] re = {out};
			return re;
		} else {
			return null;
		}
	}
}
