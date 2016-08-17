package com.bridgelabz.task;
import com.bridgelabz.util.Utility;
import com.bridgelabz.util.NodeFunctionsSorted;
public class OrderedList
{
	public static void main(String[] args) throws Exception 
	{       
    	Utility u = new Utility();
        NodeFunctionsSorted n=new NodeFunctionsSorted();
        String fileData = n.readFile("abc.txt");
        fileData = fileData.trim();
        String [] words = fileData.split(" ");
        for(int i=0; i<words.length; i++)
        {       
        	System.out.println(words[i]);
        }
        for(int i=0; i<words.length; i++)
        {
        	n.add(Integer.parseInt(words[i]));
        }
		int search;
		System.out.println("Enter word to be search:");
		search = u.inputInteger();
		if(n.search(search))
			n.remove(search);
		else
			n.add(search);
        	System.out.println("Your sorted list is:");
		n.showList();
	}
}
