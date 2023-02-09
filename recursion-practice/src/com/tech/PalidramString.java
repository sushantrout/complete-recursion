package com.tech;

public class PalidramString {
	public static void main(String[] args) {
		String testSTring = "1351531";
		boolean status = palidram(testSTring, testSTring.length() - 1, 0);
		System.out.println(status);
	}

	private static boolean palidram(String testSTring, int length, int i) {
		if ((length / 2) < i) {
			return true;
		} else {
			if (testSTring.charAt(i) != testSTring.charAt(length - i)) {
				return false;
			}
			return palidram(testSTring, length, i + 1);
		}
	}
}
