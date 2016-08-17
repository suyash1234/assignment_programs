//created generics
package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Utility<E>
{
	BufferedReader bufferedReader,buf;
	public Utility()
	{
		bufferedReader =new BufferedReader(new InputStreamReader(System.in));
	}
//reading input string
	public String inputString()
	{
		try 
		{
   	    	return bufferedReader.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
//reading Integer Input
	public int inputInteger()
	{
		try
		{
			try
            {
				return Integer.parseInt(bufferedReader.readLine());
			}
			catch(NumberFormatException e)
            {
				System.out.println(e);
			}
		}
	   	catch(Exception e)
	    {
	   		System.out.println(e);
		}
	    return 0;
	}
//reading double Input
	public double inputDouble()
	{
		try
		{
			try
			{
				return Double.parseDouble(bufferedReader.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0.0;
	}
//Harmonic method
public float reversefunction(int num)
{
	float harmonic=0;
	int i;
	for(i=1;i<=num;i++)
		{
		harmonic=harmonic+(1.0f/i);
		}
	return harmonic;
}
//Isanagram method
public static void Isanagram(String s1,String s2)
{
	String s3=s1.replaceAll("\\s","");
	String s4=s2.replaceAll("\\s","");
	boolean status=true;
	if(s3.length()!=s4.length())
	{
	 	status= false;
	}
	else
	{
		char[] s5=s3.toLowerCase().toCharArray();
		char[] s6=s4.toLowerCase().toCharArray();
		Arrays.sort(s5);
		Arrays.sort(s6);
		status=Arrays.equals(s5,s6);
	}
	if(status)
	{	
		System.out.println("it is anagram");
	}
	else
	{
		System.out.println("it is not anagram");
	}
}
//Binary search method
public int binarySearch(String[] words,String k)
{
   int first = 0,last = words.length;
   while(first < last)
   {
		int mid = (first+last)/2;
		if(k.compareTo(words[mid]) < 0)
			{
			last = mid;
			}
		else if(k.compareTo(words[mid]) > 0)
			{
			first = mid+1;
			}
		else
			{
			return mid;
			}
   }	
	return -1;
}
//random number method
public static void RandomNumber(int c) 
{
	int ran=0;
	Random r=new Random();
	for(int i=1;i<=c;i++)
	{
		ran=r.nextInt(10);
		System.out.println("coupans are: "+ran);
	}
}
//insertionsort example
	private static void printNumbers(int[] input) 
	{
		for (int i = 0; i < input.length; i++)
 		{
			System.out.print(input[i] + ", ");
 		}
 		System.out.println("\n");
 	}
//insertion sort method
	public static void insertionSort(int array[])
 	{
 		int n = array.length;
 		for (int j = 1; j < n; j++)
		{
 			int key = array[j];
 			int i = j-1;
 			while ( (i > -1) && ( array [i] > key ) )
			{
 				array [i+1] = array [i];
 				i--;
 			}
 		array[i+1] = key;
 		printNumbers(array);
 		}
	}
//power function method
public void powerfunction()
{
	int n = 4;
	int i = 0;
	int power = 1;
	while (i<=n)
	{
		System.out.println("2^"+i+" = " + power);
		power = power * 2;
		i++;
	}
}
//method of threesum program
public static void printAll(int[] a)
{
	int n = a.length;
	for (int i = 0; i < n; i++)
 	{
		for (int j = i + 1; j < n; j++) 
		{
			for (int k = j + 1; k < n; k++)
 			{
				if (a[i] + a[j] + a[k] == 0)
 				{
					System.out.println(a[i] + " " + a[j] + " " + a[k]);
				}
			}
		}
	}
}
//method of isPalindrome
public void isPalindrome(String n)
{
	Stack<String> stac=new Stack<String>();
	Queue<String> que=new LinkedList<String>();
	String s = new String();
    for(int i = 0; i < n.length( ); i++)
	{
    	s = "" + n.charAt(i);
		stac.push(s);
		que.add(s);
	}
	if(!que.remove().equals(stac.pop()))
		System.out.println("string is not palindrome");
	else		
		System.out.println("string is palindrome");
}
}
