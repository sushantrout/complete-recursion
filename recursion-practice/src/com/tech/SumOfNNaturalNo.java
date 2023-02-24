package com.tech;

import java.util.Scanner;

public class SumOfNNaturalNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a no");
		int no = sc.nextInt();
		
		System.out.println("Sum is : " + sum(no));
		
		sc.close();
	}

	private static int sum(int no) {
		if(no == 1) {
			return 1;
		} else {
			return no + sum(no-1);
		}
	}
}
