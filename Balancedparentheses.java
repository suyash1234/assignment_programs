package com.bridgelabz.task;
import com.bridgelabz.util.Stackclassmethod;
import com.bridgelabz.util.Nodestack;
import com.bridgelabz.util.Utility;
public class Balancedparentheses
{
	public Balancedparentheses()
 	{
		Utility u=new Utility();
    	Stackclassmethod<Character> stack=new Stackclassmethod();
    	System.out.println("Enter Equation Expression like (3*4)+(4*5) ");
    	String expression=u.inputString();
      	for(int i =0; i<expression.length();i++)
      	{
        	char c = expression.charAt(i);
            if(c=='(' || c=='{')
            {
            	stack.push(c);
            }
            else if(c==')'|| c=='}')
            {
            	stack.pop();
            }
        }//end of for loop
        int n=stack.size();
        if(n==0)
        {
            System.out.println("Expression is Balanced ");
        }
        else
        {
            System.out.println("Expresion is Not Balanced");
        }
   }
   public static void main(String[] args)
   {
   	Balancedparentheses bp=new Balancedparentheses();
   }
}
