package com.digit.javaTraining.oopsCodes;

//abstraction

abstract class Plane {
	void takeOff() {
		System.out.println("Plane took off");
	}

	abstract void fly();

	void land() {
		System.out.println("Plane landed");
	}
}

class CargoPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Cargo Plane fly at low heights");
	}

	void carryGoods() {
		System.out.println("Cargo Plane carry goods");
	}

}

class Airport {
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class launch9 {

	public static void main(String[] args) {
		Plane p = new Plane() {
			@Override
			void fly() {
				System.out.println("Fly method from inner types");
			}
		};
		Airport ap=new Airport();
		CargoPlane cp = new CargoPlane();
		ap.permit(cp);
		cp.carryGoods();
	}


}
