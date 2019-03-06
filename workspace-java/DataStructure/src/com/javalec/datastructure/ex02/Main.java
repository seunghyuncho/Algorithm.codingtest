package com.javalec.datastructure.ex02;

public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(11);
		numbers.addLast(12);
		numbers.addLast(14);
		numbers.addFirst(10);
		numbers.add(3, 13);
		
		
		System.out.println(numbers);
		System.out.println(numbers.hasPrevious());

		while (numbers.hasNext()) {
			System.out.println(numbers.next());
		}
		while (numbers.hasPrevious()) {
			System.out.println(numbers.previous());
		}
	}
}