package com.tech;

import java.util.Arrays;
import java.util.Scanner;

public class VanEckProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int arrayLength = sc.nextInt();
		int array[] = new int[arrayLength];
		Arrays.fill(array, -1);
		array[0] = 0;
		array[1] = 0;
		int result = vanEck(array, 2);
		System.out.println("Result is :"+ result);
		for(int i=0; i< arrayLength; i++) {
			System.out.print(array[i]);
		}
		sc.close();
	}

	private static int vanEck(int[] array, int index) {
		if(index == array.length) {
			return array[index];
		}
		array[index] = findLatIndex(array, array[index - 1], index - 1);
		return vanEck(array, index+1);
	}
	
	private static int findLatIndex(int []array , int value, int maxIndex) {
		for(int i = maxIndex; i >= 0; i--) {
			if(array[i] == value) {
				return i;
			}
		}
		return 0;
	}
}
