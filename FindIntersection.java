package com.week1.Day2.classRoom;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7}; //defined array1 values
		int[] arr2 = {1,2,8,4,9,7}; // defined array2 values
		
		for(int i=0; i<arr1.length; i++) { // iterating for loop from 0 to array length
			for(int j=0; j<arr2.length; j++) { //iterating nested for another array from 0 to array length
				if(arr1[i]==arr2[j]) { //Comparing the arrays using a condition statement
					System.out.print(" " + arr1[i]); // printing the array1 where we are comparing with array2
					
				}
			}
		
		}	

	}

}
