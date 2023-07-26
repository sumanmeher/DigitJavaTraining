package com.digit.javaTraining.multiThreading.producerConsumerProblem;

public class Queue {
	int x = 0;

	public void put(int i) {
		x=i;
		System.out.println("Producer has produced the value "+x);
		
	}

	public void get() {
		System.out.println("Consumer has produced the value "+x);
		
	}
	

}
