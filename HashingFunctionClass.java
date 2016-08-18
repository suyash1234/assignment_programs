package com.bridgelabz.task;
import com.bridgelabz.util.NodeUtility;
import com.bridgelabz.util.NodeHash;
import com.bridgelabz.util.Ordered;
import com.bridgelabz.util.OrderedLinkedList;
import com.bridgelabz.util.Utility;
public class HashingFunctionClass
{
	NodeHash node;
    boolean option;
  	Utility u = new Utility();
	Ordered[] order=new Ordered[11];
	NodeUtility nu=new NodeUtility();
	public  HashingFunctionClass()
	{
		int[] retArray = nu.integerFileReader();
		System.out.println(retArray);
		for(int i=0; i<retArray.length; i++)
		{
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new Ordered();
				order[rem].addItem(retArray[i]);
			}
			else
				order[rem].addItem(retArray[i]);
       }
   		for(int i=0;i<11;i++)
		{
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
	}
	public static void main(String[] args) 
	{
		HashingFunctionClass hs=new HashingFunctionClass();
	}
}
