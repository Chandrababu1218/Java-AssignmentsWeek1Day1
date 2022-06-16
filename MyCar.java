
package com.week1.Day2.classRoom;

public class MyCar {
	public static void main(String[] args) {
		Car car = new Car();  // created another call object in current class and calling the methods of  Car class
		// car.applyGear(); which is in private
		 car.applyBreak(); // calling method of another class with that class object
		 car.switchOnAc(); // calling method of another class with that class object
		car.applyAcclerate(); // calling method of another class with that class object
	}

}
