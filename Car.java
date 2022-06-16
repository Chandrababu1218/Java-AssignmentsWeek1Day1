package com.week1.Day2.classRoom;

public class Car {
	
	public void applyBreak()  //public method for applyBreak
	{
		System.out.println("Applied break"); // printing the method data
	}
	
	 private  void applyGear()   // declaring the applyGear method with private
	  {
		System.out.println("Applied Gear"); //printing method data
		
	}
	 
	  void switchOnAc()  // default method declaration
	 {
	
		 System.out.println("AC Switched On");
	 }
	  
	  public void applyAcclerate()  //  public method for applyBreak
	  {
		  System.out.println("Applied acclerate");
		  
	  }
	
	 public static void main(String[] args) 
	 {
		 Car car = new Car(); // creating the object for Car class
		 car.applyGear();  // calling method with object
		 car.applyBreak(); // calling method with object
		 car.switchOnAc(); // calling method with object
		car.applyAcclerate(); // calling method with object
		
		
		
	}

	public boolean isCarpunctured() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
