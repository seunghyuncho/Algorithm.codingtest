package cafe24.codingtest;

public class Stack_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack st = new MyStack(3);

		st.push("Hello");
		st.push("it's me");
		st.push("i was wondering");
		st.push("if i don't care");
		st.push("about me");

		st.printStack();

		st.pop();
		st.pop();
		st.pop();
		st.pop();

		st.push("hello");
		st.pop();

		st.printStack();

	}

}
