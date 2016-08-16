package com.bridgelabz.task;
import com.bridgelabz.util.*;
public class factors
{
//main method
	public static void main(String args[]) 
	{
		Utility u=new Utility();
         //reading numbers from screen
		int n;
		System.out.print("Enter a Number : ");
		n=u.inputInteger();
		System.out.print("The Prime Factors of "+n+" are : ");
 		int i=2;
		while(n>1)
		{
			if(n%i == 0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
			else
			i++;
		}
	}
}
