package com.digit.javaTraining.multiThreading.producerConsumerProblem;

public class Consumer extends Thread {
	Queue b;

	public Consumer(Queue q) {
		b = q;
	}

	public void run() {
		int i = 0;
		while (true) {
			b.get();
		}
	}
}
