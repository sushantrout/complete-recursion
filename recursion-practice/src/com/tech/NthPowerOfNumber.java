package com.tech;

import java.util.Scanner;

public class NthPowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a no");
		int no = sc.nextInt();

		System.out.println("Please enter power");
		int p = sc.nextInt();

		System.out.println("Power is =>  " + pow(no, p) + "\t AUl => " + powUsing2ndApproach(no, p));

		sc.close();
	}

	private static int pow(int no, int p) {
		if (p == 1) {
			return no;
		} else {
			return no * pow(no, p - 1);
		}
	}

	private static int powUsing2ndApproach(int no, int po) {
		if (po == 0) {
			return 1;
		}
		int temp = powUsing2ndApproach(no, po / 2);
		if (po % 2 == 1) {
			return temp * temp * no;
		} else {
			return temp * temp;
		}
	}
}
