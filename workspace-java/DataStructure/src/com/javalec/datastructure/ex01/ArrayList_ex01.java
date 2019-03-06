package com.javalec.datastructure.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<String> myArr = new ArrayList<>();
		LinkedList<String> myAr = new LinkedList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		myArr.add("123");
		myArr.add("456");
		myArr.add("123");
		myArr.add("123");

		for (String value : myArr) {
			System.out.println(value);
		}
		for (int i = 0; i < myArr.size(); i++) {
			System.out.println(myArr.get(i));
		}

		System.out.println(myArr.get(1));

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
