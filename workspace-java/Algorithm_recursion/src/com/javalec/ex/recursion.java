package com.javalec.ex;

import java.util.Scanner;

public class recursion {
	public static int sum(int n, int[] data) {
		if (n <= 0) {
			return 0;
		} else {
			return sum(n - 1, data) + data[n + 1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int[] num2 = {};
		System.out.println(sum(num1, num2));

	}
}
