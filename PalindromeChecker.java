package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class PalindromeChecker
{
	public static void main(String str[])
	{
		Utility u=new Utility();
		System.out.println("Enter any string");
		String n=u.inputString();
		u.isPalindrome(n);
	}
}
