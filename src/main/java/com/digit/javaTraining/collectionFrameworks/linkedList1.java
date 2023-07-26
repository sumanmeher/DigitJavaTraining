package com.digit.javaTraining.collectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList1 {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		ArrayList a1=new ArrayList();
		
		LinkedList l2=new LinkedList();
		
		l1.add(500);
		l1.add(200);
		
		System.out.println(l1);
		
		a1.add(300);
		a1.add(400);
		
		a1.add(l1);
		System.out.println(a1);
		
//		l1.add(a1);                  //StackOverFlowError
//		System.out.println(l1);

		System.out.println(a1.get(2));
		
		l1.addFirst(50);
		System.out.println(l1);
		
		System.out.println(l1.getFirst());
		
		
		System.out.println(l1.getLast());
		
		
		
		System.out.println(l1.listIterator(0));
		System.out.println(l1.listIterator(1));
		System.out.println(l1.listIterator(2));
		
		System.out.println(l1.iterator());
		
		System.out.println(l1.listIterator());
		
		l1.sort(null);
		System.out.println(l1);
		
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
	}

}
