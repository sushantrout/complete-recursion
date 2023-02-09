package com.tech;

public class RevershArrayUsingJava {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int length = array.length;
		int half = length / 2;
		reversh(array, 0, half, length - 1);
		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void reversh(int[] array, int i, int half, int length) {
		if (half < i) {
			return;
		} else {
			int temp = array[i];
			array[i] = array[length - i];
			array[length - i] = temp;
			reversh(array, i + 1, half, length);
		}
	}
}
