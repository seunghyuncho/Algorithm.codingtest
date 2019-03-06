package com.javalec.datastructure.ex01;

public class ArrayList {

	private int index = 0;
	private int size;
	private Object[] elementData;

	public ArrayList() {
		size = 100;
		elementData = new Object[size];
	}

	public ArrayList(int size) {
		this.size = size;
		elementData = new Object[size];
	}

	public boolean addLast(Object element) {
		elementData[index] = element;

		// ele[0] = 10 ele[1] = 11
		index++;
		return true;
	}

	//toString 메서드 재정의
	public String toString() {
		String str = "[";
		for (int i = 0; i < index; i++) {
			str += elementData[i];
			if (i < index - 1) {
				str += ", ";
			}
		}
		return str + "]";
	}
}
