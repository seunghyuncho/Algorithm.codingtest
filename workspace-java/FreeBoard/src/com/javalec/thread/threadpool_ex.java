package com.javalec.thread;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class threadpool_ex implements Runnable {
	private static final String MSG_TEMPLATE = "출력중 [%s] [%d회]";
	private final String threadName;

	public threadpool_ex(String threadName) {
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

	public void main(String args[]) {
		threadpool_ex runnable1 = new threadpool_ex("thread1");
		threadpool_ex runnable2 = new threadpool_ex("thread2");
		threadpool_ex runnable3 = new threadpool_ex("thread3");

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(runnable1);
		executorService.execute(runnable2);
		executorService.execute(runnable3);

		executorService.shutdown();
		try {
			if (!executorService.awaitTermination(5, TimeUnit.MINUTES)) {
				executorService.shutdownNow();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			executorService.shutdownNow();
		}
	}

}
