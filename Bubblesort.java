package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class Bubblesort
{
//main method
	public static void main(String []args)
	{
		Utility u=new Utility();
		int n, c, d, swap;
		System.out.println("Input number of integers to sort");
		n = u.inputInteger();
    	int array[] = new int[n];
 //printing n integers
		System.out.println("Enter " + n + " integers");
		for (c = 0; c < n; c++) 
 		array[c] = u.inputInteger();
    	for (c = 0; c < ( n - 1 ); c++)
			{
	  		for (d = 0; d < n - c - 1; d++) 
				{
		 			if (array[d] > array[d+1]) 
			 		{
			 			swap = array[d]; 
			 			array[d] = array[d+1];
			 			array[d+1] = swap;
			  		}
		  		}
	 		}
 //sorted numbers
		System.out.println("Sorted list of numbers");
	    for (c = 0; c < n; c++) 
	    System.out.println(array[c]);
 	 }
}
