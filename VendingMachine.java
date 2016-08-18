package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
public class VendingMachine
{
	//initialization of variable
	static int i=0;
	static int total=0;
	//array initialization
	static int notes[]={1000,500,100,50,20,10,5,2,1};
	static int money;
	public static int returnMoney(int money,int notes[])
	{
	//calculate min number of nodes
		if(money==0)//if-else loop
		{
			return -1;
		}
		else if(money>=notes[i])
		{
			int calculatenotes=money/notes[i];
			int rem=money%notes[i];
			money=rem;
			System.out.println(notes[i]+" notes->"+calculatenotes);
		}
		i++;
        return returnMoney(money,notes);
	}
	//main method
	public static void main(String str[])
	{	
		Utility u=new Utility();
		System.out.println("Enter how much money you want to put");
	    money=u.inputInteger();
		VendingMachine vm=new VendingMachine();
		vm.returnMoney(money,notes);
	}		
}
