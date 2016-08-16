package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
class Leapyear
{
	//main method start 
	public static void main(String str[]) throws Exception
	{
		Utility u =new Utility(); 
		System.out.println("Enter a Year");
		int n=u.inputInteger();
		if(n%100==0)
		{
			if(n%400==0)
			System.out.println("it is a leap year");
			else
			System.out.println("it is not a leap year");
		}
		else if(n%4==0)
			System.out.println("it is a leap year");
			else
				System.out.println("it is not a leap year");

	}
}
