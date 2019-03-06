import java.util.Scanner;

public class stack {
	int top;
	int[] stack;
	int size;

	public stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;

	}

	public int peek() {
		System.out.println(stack[top]);
		return stack[top];

	}

	public void push(int value) {
		stack[++top] = value;
		System.out.println(stack[top] + " push!");

	}

	public int pop() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st = new stack(100);

		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);

		st.printStack();

		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		st.peek();

		st.push(10);
		st.pop();

		st.printStack();

	}

}
