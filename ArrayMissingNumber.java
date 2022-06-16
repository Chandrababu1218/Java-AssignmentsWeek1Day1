package com.week1.Day2.classRoom;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {1,2,3,4,7,6,8}; //defining the array with values
		
		System.out.println("Length of array: " + arr.length); //printing the length of the array
		
		Arrays.sort(arr); // sorting the array so that values will sort to ascending order
		
		for(int i=1; i < arr.length; i++) //iterating the array starting from 0 index until length of the array
		{
			if(i!=arr[i-1]) // checkking the iterator is not equal to array value so that is the missing value
			
			{
			
			System.out.println("Missing number in array : " + i);// printing the missing value of array
			
			break;  //breaking the iteration once printed the number
			}
			
		}
		
       
	}

}
