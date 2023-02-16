package com.tech;

public class FindPermutationOfString {
	public static void main(String[] args) {
		findPermuattion("ABC", 0, "");
	}

	private static void findPermuattion(String string, int idx, String perm) {
		if (string.length() == 0) {
			System.out.println(perm);
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
			String nerString = string.substring(0, i) + string.substring(i + 1);
			findPermuattion(nerString, idx + 1, perm + charAt);
		}
	}
}
