package com.digit.javaTraining.multiThreading.producerConsumerProblem;

public class Consumer2 extends Thread {
	Queue2 b;

	public Consumer2(Queue2 q) {
		b = q;
	}

	public void run() {
		while (true) {
			b.get();
		}
	}
}
