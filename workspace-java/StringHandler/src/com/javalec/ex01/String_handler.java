package com.javalec.ex01;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class String_handler {
	static String names[] = new String[1000];
	static int numbers[] = new int[1000];
	static int n = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		try {
			sc = new Scanner(new File("input.txt"));

			while (sc.hasNext()) {
				names[n] = sc.next();
				numbers[n] = Integer.parseInt(sc.next());
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			System.exit(1);
		}
		System.out.println(n);
		bubblesort(n, names, numbers);

		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
			System.out.println(numbers[i]);
		}

	}

	public static void bubblesort(int n, String[] names, int[] numbers) {

		for (int i = n - 1; i < n; i--) {
			for (int j = 0; j < i; j++) {
				// swap
				if (names[j].compareTo(names[j + 1]) > 0) {
					String tempstr = names[j];
					names[j] = names[j + 1];
					names[j + 1] = tempstr;

					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

	}
}
