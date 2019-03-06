package com.javalec.thread;

public class thread_ex implements Runnable {
	private static final String MSG_TEMPLATE = "출력중 [%s] [%d]회";
	private final String threadName;

	public thread_ex(String threadName) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			System.out.println(String.format(MSG_TEMPLATE, threadName, i));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_ex runnable1 = new thread_ex("thread1");
		thread_ex runnable2 = new thread_ex("thread2");
		thread_ex runnable3 = new thread_ex("thread3");

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		Thread thread3 = new Thread(runnable3);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
