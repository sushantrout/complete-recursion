package com.tech;

public class PalidramStringSecondApproach {
	public static void main(String[] args) {
		String testSTring = "13515311";
		boolean status = palidram(testSTring);
		System.out.println(status);
	}
	
	private static boolean palidram(String testSTring) {
		int length = testSTring.length();
		if (testSTring.isEmpty() || length == 1) {
			return true;
		} else {
			if (testSTring.charAt(0) != testSTring.charAt(length - 1)) {
				return false;
			}
			return palidram(testSTring.substring(1, length - 1));
		}
	}
}
