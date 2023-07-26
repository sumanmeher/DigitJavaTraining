package com.digit.javaTraining.multiThreading.producerConsumerProblem;

public class Producer2 extends Thread {

	Queue2 a;

	public Producer2(Queue2 q) {
		a = q;

	}

	public void run() {
		int i = 0;
		while (true) {
			a.put(i++);
		}
	}

}
