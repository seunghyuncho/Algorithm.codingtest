package com.javalec.ex;

import java.util.Scanner;

public class double_power {
	public static double dp(double x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * dp(x, n - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 적어주세요 : ");
		double num = sc.nextDouble();

		System.out.println("제곱수를 적어 주세요 : ");
		int num1 = sc.nextInt();

		System.out.println(dp(num, num1));

	}

}
