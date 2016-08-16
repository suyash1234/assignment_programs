package com.bridgelabz.task;
import java.util.Random;
import com.bridgelabz.util.Utility;
public class flip 
{
	static  int head;
	static  int tail;
	static int headper;
	static int tailper;
//main method
    public static void main(String[] args)
    {
// input from keyboard        
		Utility u=new Utility();
   		System.out.println("Enter the number of time you want to flip");
		int b=u.inputInteger();
		Random r=new Random();
		for(int i=0;i<b;i++)
		{
			if(r.nextInt()<0.5)
			{
				tail++;
				System.out.println("tail");
			}
 			else
			{
				head++;
				System.out.println("head");
			}
		}
//calculate percentage
		tailper= 100*tail/b; 
		headper=100*head/b;  
		System.out.println("percentage of tail= " + tailper +"%");
		System.out.println("percentage of head =" + headper +"%");
    			
	}
}


    
     
    

