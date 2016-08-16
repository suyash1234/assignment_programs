package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class Binarysearch 
{
//main method
	public static void main(String str[])throws Exception
		{
//utility class
		Utility u=new Utility();
		System.out.println("Enter number of  element u want to enter");
		int a=u.inputInteger();
		String[] arr=new String[a];
		System.out.println("Now enter the element");
//initialization of for loop
	    for(int i = 0;i<a;i++)
		{
			arr[i]=u.inputString();
        }
		System.out.println("Enter a element u want to search");
		String search = u.inputString();
		int index=u.binarySearch(arr,search);

		if(index==(-1))
			{
			System.out.println("element is not found");
			}
		else
			{
		System.out.println("enter element found at" +index);
			}
		}
}

	



