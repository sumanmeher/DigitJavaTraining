/**
 * 
 */
package com.digit.javaTraining.collectionFrameworks;

import java.util.ArrayList;

/**
 * 
 */
public class arrayList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		//ArrayList a3 = new ArrayList();
		a1.add(100);
		a1.add(1, 200);
		System.out.println("ArrayList 1: " + a1);

		a2.add(300);
		a2.add(400);
		System.out.println("ArrayList 2: " + a2);

		a1.addAll(a2);
		System.out.println("ArrayList 1 including Array List 2: " + a1);

		a1.addAll(4, a2);
		System.out.println("ArrayList 1 also including Array List 2: " + a1);

		a2.clear();
		System.out.println("ArrayList 2: " + a2);

		a2.add(100);
		a2.add(200);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.contains(100)); 

		System.out.println(a1.containsAll(a2));

		System.out.println(a1.equals(a2));

		System.out.println(a1.get(2));

		System.out.println(a1.isEmpty());

		System.out.println(a1.indexOf(200));

		System.out.println(a1.lastIndexOf(200));

		

		a1.remove(0);
		System.out.println(a1);

		a1.set(0, 600);
		System.out.println(a1);

		a1.sort(null);
		System.out.println(a1);

		System.out.println(a1.size());
		
		ArrayList a3=(ArrayList) a1.clone();
		System.out.println(a3);
		
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1.remove(a2);
		System.out.println(a1); // wrong o/p
	}

}
