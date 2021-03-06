package cafe24.codingtest;

public class MyStack {
	int top;
	int size;
	String[] stack;
	String[] tempArray;

	public MyStack(int size) {
		top = -1;
		stack = new String[size];
		tempArray = new String[size()];
		this.size = size;
	}

	public void push(String value) {
		if (stack.length > 2) {
			stack = tempArray;
		}
		stack[++top] = value;
		System.out.println(top);

	}

	public String pop() {
		System.out.println(stack[top] + " pop!!");
		return stack[top--];
	}

	public void printStack() {
		System.out.println("---------stack list-------------");
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
		System.out.println("---------stack list-------------");
	}

	public int size() {
		return 2 * stack.length;
	}

}
