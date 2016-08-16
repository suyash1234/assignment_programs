package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class coupon 
{
//main method 
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter number of coupans want to generate ");
		int c=u.inputInteger();
		u.RandomNumber(c);
	}
}


