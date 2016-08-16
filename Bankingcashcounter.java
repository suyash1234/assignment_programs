package com.bridgelabz.task;
import com.bridgelabz.util.Bankingqueue;
import com.bridgelabz.util.Nodequeue;
import com.bridgelabz.util.Utility;
public class Bankingcashcounter
{
	static int cashBal = 10000;
	Utility u1=new Utility();
    public Bankingcashcounter()
   	{
    	Bankingqueue <Integer> obj = new Bankingqueue<Integer>();
    	while(true)
     	{
        	System.out.println("...Choose Option... ") ;
        	System.out.println("1---Deposit ") ;
         	System.out.println("2---Withdraw ") ;
         	System.out.println("3--- Go for Service ") ;
         	System.out.println("4--- display them in Queue ") ;
         	System.out.println("5--- User will see total cash Counter ") ;
         	System.out.println("6--- Exit") ;
         	System.out.println("...Choose Option...") ;
         	int choice =u1.inputInteger();
         	switch(choice)
         	{
            	case 1:
                obj.addAtFront(choice);
                break;
             	case 2:
                obj.addAtFront(choice);
                break;
             	case 3:
                obj.doOpearations();
                break;
             	case 4 :
                obj.display();
                break;
             	case 5 :
                int cash= obj.getCashCounterBalance();
                System.out.println("Total Cash in cash Counter "+cash);
                break;
				case 6:
                System.out.println("Application is closed...");
                System.exit(1);
                break;
                default : System.out.println("Invalid Key Pressed..!!!");
            }//end of switch case
        }//end of while loop
  }//end of constructor
public static void main(String[] args)
  {
    Bankingcashcounter bc=new Bankingcashcounter();
  }
}
