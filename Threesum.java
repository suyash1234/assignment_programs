package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class Threesum
{
//main method
	public static void main(String[] args)
	{
		Utility u=new Utility();
		int a1;
 //taking input from keyboard
		System.out.println("Enter the size of array");
		int n = u.inputInteger();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++)
		{
			a[i] = u.inputInteger();
		}
		u.printAll(a);
	}
}		


