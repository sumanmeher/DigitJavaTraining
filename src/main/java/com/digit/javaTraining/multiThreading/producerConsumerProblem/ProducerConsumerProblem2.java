package com.digit.javaTraining.multiThreading.producerConsumerProblem;

public class ProducerConsumerProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 q2 = new Queue2();
		Producer2 p2 = new Producer2(q2);
		Consumer2 c2 = new Consumer2(q2);

		p2.start();
		c2.start();

	}

}
