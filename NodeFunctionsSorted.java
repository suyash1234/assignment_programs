package com.bridgelabz.util;
import com.bridgelabz.util.Node1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;

public class NodeFunctionsSorted
{
	Node1 head;
	Node1 tail;
    public String readFile(String fileName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(fileName);
       		String word="";
           	while (fis.available() > 0)
			{
            	char ch = (char) fis.read();
             	word = word+ch;
           	}
        	return word;
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		return null;
	}
	public void display()
	{  
    	String list="";
   		Node1 current= head;
   		if (head== null)
    	System.out.println("List is empty");
  		else
		{
  			while(current!= null)
  			{  
    			System.out.println(current.getValue());
   				list = list+current.getValue()+" ";
    			current= current.getNext();
  			}
  		}
	}
	public void add(int value)
    {
		Node1 n = new Node1();
		n.setValue(value);// set value of node
		Node1 temp = head;
		Node1 prev = head;
		boolean ins = false;
		// if list is empty make it head and tail
		if (head == null)
		{
			head = n;
		}
		else
		{
			if (value < head.getValue())
			{
				n.setNext(head);
				head = n;
			}
			else 
			{
				while (temp.getNext() != null)
				{
					if (value >= temp.getValue() && value <= prev.getValue())
					{
						temp.setNext(n);
						n.setNext(prev);
						ins = true;
						break;
					}
					else
					{
						temp = prev;
						prev = prev.getNext();
					}
				}
				if (ins == false)
				{
					temp.setNext(n);
				}
			}
		}
	}
	public void showList() 
    {
		Node1 temp = head;
		// if linked list is empty
		if (temp == null)
			System.out.println("List is null");
		else
		{
			while (temp != null)// display linked list
			{
				System.out.println( temp.getValue());
				temp = temp.getNext();
			}
		}
	}

	public boolean search(int search)	//search for item
	{
	  Node1 temp=head;
	  if(temp==null)
	     return false;
	  while(temp!=null)
	  {
	  	if(search==temp.getValue())
	    {
	      return true;
	    }
	    temp=temp.getNext();
	  }
	  return false;
	}//end of searchList
	
	public int size()
	{
	   int count=0;
	   Node1 temp=head;
	   if(temp==null)
	      return count;
	   else
	      while(temp!=null)
	      {
	         count++;
	         temp=temp.getNext();
	      }
	   return count;
	}//end of size()

	//return true if list is empty
	public boolean isEmpty()
	{
	  if(head==null)
	    return true;
	  else
	    return false;
	}//end isEmpty()
	
	public int index(int value)
	{
	  Node1 temp=head;
	  int count=0;
	  if(temp==null)
	    return count;
	  else
	    while(temp!=null)
	    {
	      count++;
	      if(value==temp.getValue())
	      {
	        return count;
	      }
	      temp=temp.getNext();
	    }
	  return -1;
	}
	
	public void remove(int value)
	{
		Node1 n=new Node1();
		Node1 temp=head;
		Node1 previous=head;
		if(temp==null)
			System.out.println("Cannot remove");
		else 
		{
		while(value!=temp.getValue())
		{
				previous=temp;
				temp=temp.getNext();
		}
			if(temp==head)
			{
				head=head.getNext();
				temp.setNext(null);
			}
			else
		    {   
		      previous.setNext(temp.getNext());
		      temp.setNext(null);
		    }
		}
	}
}
