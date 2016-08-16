package com.bridgelabz.task;
import java.util.Date;
public class stopwatch
{
//variables initilization
	public long starttime=0;
	public long endtime=12345678;
	public long elaspe;
//method definition
	public void start()
	{
		starttime=System.currentTimeMillis();
		System.out.println("start time is :"+starttime);
	}
	public void end()
	{
		System.out.println("end time is :"+endtime);
	}
	public void elaspe()
	{
		long elaspetime=endtime-starttime;
		System.out.println("Elaspe time is :" +elaspetime);
	}
//main method
	public static void main(String str[])
	{
		stopwatch s=new stopwatch();
		s.start();
		s.end();
		s.elaspe();
	}
}
