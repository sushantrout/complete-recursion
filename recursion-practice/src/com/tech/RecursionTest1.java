package com.tech;

/**
 * 
 * @author Sushant Kumar Rout
 *
 */
public class RecursionTest1 {
	public static void main(String[] args) {
		print(5);
		System.out.println();
		backPrint(5);
	}
	
	/**
	 * This is forward recursion
	 * @param n
	 */
	public static void print(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		print(n-1);
	}
	
	/**
	 * This is back recursion 
	 * @param n
	 */
	private static void backPrint(int n) {
		if(n == 0) {
			return;
		}
		backPrint(n-1);
		System.out.println(n);
	}
}
