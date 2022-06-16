package com.week1.Day2.classRoom;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,15}; // declaring the values for array
		
		System.out.println("Lenght of the array: " + arr.length); // printing the length of the array
		Arrays.sort(arr);  //sorting the array in ascending order
		for(int i=0; i<arr.length-1; i++) { // iterating for loop from 0 to the array length-1 
		
			for(int j=i+1; j < arr.length; j++) { // iterating inner for loop from i to the length of the array by adding 1 to it
				
				if(arr[i] == arr[j]) { //comparing the outer loop value with inner loop both are equal or not
					System.out.println(arr[i]); // printing the value which is equal in outerloop and inner loop
				}
				
			}
		}

	}

}
