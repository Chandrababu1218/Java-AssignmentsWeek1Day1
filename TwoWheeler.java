package com.week1.Day2.classRoom;

public class TwoWheeler {
	//declared below global variables with appropriate values
	int noOfWheels = 2;
	short noOfMirrors = 2; 
	long chassisNumber = 3052L;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKM = 55000L;

	public static void main(String[] args) {
//create object for TwoWheeler and call all the variables inside main method and print the values.
		
		TwoWheeler twoWheeler = new TwoWheeler(); //created object for TwoWheeler
		int wheels = twoWheeler.noOfWheels; // calling the variables in main method
	    System.out.println("noOfWheels: " + wheels ); // printing the values.
	    
		System.out.println("noOfMirrors:" + twoWheeler.noOfMirrors);  // calling the variables in side main method and printing the values
		System.out.println("chassisNumber: " + twoWheeler.chassisNumber); // calling the variables in side main method and printing the values
		System.out.println("isPunctured: " + twoWheeler.isPunctured); // // calling the variables in side main method and printing the values
		System.out.println("bikeName: " + twoWheeler.bikeName); // calling the variables in side main method and printing the values
		System.out.println("runningKM: " + twoWheeler.runningKM); // calling the variables in side main method and printing the values
	 

	}

}
