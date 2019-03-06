public class Queue {

	static int top = 0;
	static int[] queue = new int[100];

	public static void push(int x) {
		queue[top] = x;
		top++;
	}

	public static int pop() {
		return queue[top--];
	}

	public static void print() {
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		pop();

		print();

	}

}
