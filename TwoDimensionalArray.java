package com.bridgelabz.task;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TwoDimensionalArray
{
	static int i,j;
//reading 2D array from standard input
	public static int[][] readArray()
	{
		int m=StdIn.readInt();
		int n=StdIn.readInt();
		int[][] a=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=StdIn.readInt();
			}
		}
		return a;
	}
//printing 2D array from standard output
	public static void printArray(int[][] a)
	{
		int m=a.length();
		int n=a.length();
		StdOut.println(m+" "+n);
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				StdOut.printf(a[i][j]);
			}
		}
	}
	public static void main(String str[])
	{
		int[][] b = StdArrayIO.readArray();
        StdArrayIO.print(b);
        StdOut.println();
	}
}
