package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class Harmonic
{
//main method 
	public static void main(String args[])
		{
//variables declaration
		int num;
		float harmonic;
		Utility u=new Utility();//utility class 
		System.out.println("Enter any number");
		num=u.inputInteger();
		if(num>0)
			{
			harmonic=u.reversefunction(num);
			System.out.println("harmonic value is:=" +harmonic);
			}
		else
			{
			System.out.println("Enter number is less than zero");
			}
		}
}		



