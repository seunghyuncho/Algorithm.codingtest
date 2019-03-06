package com.javalec.datastructure.ex02;

public class ArrayList {

	private int index = 0;
	private int size;
	private Object[] data;
	private ListIterator iterator;

	public ArrayList() {
		iterator = new ListIterator();
		size = 100;
		data = new Object[size];
	}

	public ArrayList(int size) {
		iterator = new ListIterator();
		this.size = size;
		data = new Object[size];
	}

	public boolean addLast(Object element) {
		data[index] = element;
		index++;
		return true;
	}

	public boolean add(int targetIndex, Object element) {
		for (int i = index - 1; i >= targetIndex; i--) {
			data[i + 1] = data[i];
		}
		data[targetIndex] = element;
		index++;
		return true;
	}

	public boolean addFirst(Object element) {
		return add(0, element);
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < index; i++) {
			str += data[i];
			if (i < index - 1) {
				str += ", ";
			}
		}
		return str + "]";
	}

	public Object remove(int targetIndex) {
		Object removed = data[targetIndex];
		for (int i = targetIndex + 1; i <= index - 1; i++) {
			data[i - 1] = data[i];
		}
		index--;
		data[index] = null;
		return removed;
	}

	public int size() {
		return index;
	}

	public Object removeFirst() {
		return remove(0);
	}

	public Object removeLast() {
		return remove(index - 1);
	}

	public Object next() {
		return this.iterator.next();
	}

	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	public Object previous() {
		return this.iterator.previous();
	}

	public boolean hasPrevious() {
		return this.iterator.hasPrevious();
	}

	private class ListIterator {
		private int nextIndex = 0;

		private boolean hasNext() {
			return nextIndex < size();
		}

		private Object next() {
			return data[nextIndex++];
		}

		private boolean hasPrevious() {
			return nextIndex > 0;
		}

		private Object previous() {
			return data[--nextIndex];
		}
	}
}
