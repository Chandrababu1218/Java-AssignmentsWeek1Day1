package com.week1.Day2.classRoom;

import javax.print.attribute.standard.PrinterName;

public class EmployeeDetails 
{
	public  void EmployeeDetails(String empName, int empId) // passing the parameters in method
	{
		System.out.println( "Emp Details are : " + empName + "  " + empId); //printing the parameter values 
	}
	public String getEmployeeAddress(String empAddress) 
	{
		return empAddress; // return type is used since datatype is String
	}
	
	public double printEmployeeSalary(double empSalary)
	{
		return empSalary;  // return type is used since datatype is double
	}
	
	public long printEmployeeMobileNumber(long mobNum)
	{
		return mobNum;  // return type is used since datatype is long
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails empDetails = new EmployeeDetails(); // creating object to the class
		
			
		empDetails.EmployeeDetails("Chandrababu", 1218); // //passing values inside the parametarized method
				
		String employeeAddress = empDetails.getEmployeeAddress("Flat 102, Bachupally, Hyderabad 500090"); // storing the values in string variable
		System.out.println("Employee Address: " +employeeAddress);  // printing the string variable
		
		double printEmployeeSalary = empDetails.printEmployeeSalary(1200000L);    // storing the values in double variable
		System.out.println("Employee Salary: "+printEmployeeSalary);  // printing the double variable
		
		long printEmployeeMobileNumber = empDetails.printEmployeeMobileNumber(1234567890); // printing the long variable
		System.out.println("EMP Mobile Numner: " + printEmployeeMobileNumber); // printing the long variable
		
		

	}

}
