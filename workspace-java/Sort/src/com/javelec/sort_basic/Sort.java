package com.javelec.sort_basic;

import java.util.Scanner;

public class Sort {

	int[] data;
	int size;
	int min;
	int temp;
	int l;
	int r;

	public Sort(int[] data) {
		this.data = data;
		this.size = 0;
		this.min = 0;
		this.size = data.length;
		this.l = 0;
		this.r = data.length - 1;
	}

	public void SelectionSort() {
		for (int i = 0; i < size - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}

	}

	public void BubbleSort() {
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	public void QuickSort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
		if (l < right) {
			QuickSort(data, l, right);
		}
		if (r > left) {
			QuickSort(data, left, r);
		}

	}

	public void printStack(int n) {
		if (n == 1) {
			for (int i = 0; i < data.length; i++) {
				SelectionSort();
				System.out.print(data[i] + " ");
			}
		} else if (n == 2) {
			for (int i = 0; i < data.length; i++) {
				BubbleSort();
				System.out.print(data[i] + " ");
			}
		} else if (n == 3) {
			for (int i = 0; i < data.length; i++) {
				// InsertionSort();
				System.out.print(data[i] + " ");
			}
		} else if (n == 4) {
			for (int i = 0; i < data.length; i++) {
				QuickSort(data, l, r);
				System.out.print(data[i] + " ");
			}
		} else {
			System.out.println("error no exist form of sort");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] date = { 43, 23, 53, 42, 34, 76, 44, 20, 78 };

		Sort srt = new Sort(date);
		Scanner sc = new Scanner(System.in);
		System.out.println("ㅇ정렬하고 싶은 정렬을 입력하세요 : ex) 1 selection 2 bubble 3 insertion 4 quick");

		int n = sc.nextInt();

		srt.printStack(n);

		sc.close();
	}

}
