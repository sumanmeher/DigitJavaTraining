package com.digit.javaTraining.multiThreading.producerConsumerProblem;

public class Queue2 {
	int x;
	boolean value_of_x = false;

	synchronized public void put(int i) {
		try {
			if (value_of_x != true) {
				x = i;
				System.out.println("Producer has produced the value " + x);
				value_of_x = true;
				notify();

			} else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	synchronized public void get() {
		try {
			if (value_of_x != false) {

				System.out.println("Consumer has produced the value " + x);
				value_of_x = false;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
