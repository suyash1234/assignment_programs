package com.bridgelabz.task;
public class gambler
{
	//main method
	public static void main(String str[])
	{
		int stake=5;
		int trial=10;
		int goal=20;
		int bets=0;
		int wins=0;
//initialization of forloop
		for( int i=0;i<trial;i++)
		{
			int c=stake;
			while(c>0 && c<goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					c++;
				}
				else
				{
					c--;
				}
			}
			if(c==goal)
			{
				wins++;
			}
		}
//printing values of wins and bets
System.out.println(wins+ "wins of" +trial);
System.out.println("percentage of game win=" + 100*wins/trial +"%");
System.out.println("average bets=" +1.0*bets/trial);
		}
	}
