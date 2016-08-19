package com.bridgelabz.util;
import com.bridgelabz.util.NodeHash;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io. BufferedReader;
import java.io.IOException;
public class NodeHashUtility
{      
	NodeHash data;
	NodeHash head;
	String[] stringArray;
    int[] intArray;
  	//Reading string from file
    public NodeHash readFile(NodeHash start)
    {
    	try
		{
        	FileInputStream fis = new FileInputStream("xyz.txt");
            char ch;
            String word3="";
            while (fis.available() > 0)
            {
            	ch = (char) fis.read();
            	word3=word3+ch;
            }
           	String[] wordsArray=word3.split(" ");
            int[] inputArray=new int[wordsArray.length-1];
            for(int i=0;i<wordsArray.length-1;i++)
			{
	            inputArray[i]=Integer.parseInt(wordsArray[i]); //converting string to integer
            }
            inputArray=sort(inputArray);
            for(int i =0; i < wordsArray.length-1 ; i++)
            {
            	start=addWordstoList(start,inputArray[i]);//calling to inset data
            }
         }
         catch(IOException e)
		 {
         }
         return start;
	}
//read interger file
	public int[] integerFileReader()
    {
        try
        {
            String intFile = new String();
            FileReader fr=new FileReader("bcd.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null)
			{
				intFile += s;
            }
            intFile = intFile.replaceAll("\\n",",");
            intFile = intFile.trim();
            stringArray = intFile.split(" "); 
            intArray = new int[stringArray.length];
            for(int i=0; i <intArray.length;i++)
            {
                try
                {
                    intArray[i]= Integer.parseInt(stringArray[i]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println(e);
                }
            }
        }
        catch(Exception obj)
        {
            System.out.println("e");
        }
        return intArray;
    }

//End of insert method
	public NodeHash addWordstoList(NodeHash node1,int num)
	{
	    NodeHash node2=node1;
	    NodeHash newNode=new NodeHash();
	    newNode.data=num;
	    newNode.nextNode=null;
	    if(node1==null)
	    {
	    	return newNode;
	    }
	    else
		{
	    	while(node1.nextNode!=null)
	        {
	        	node1=node1.nextNode;
	        }
	      	node1.nextNode=newNode;
	    }
	    return node2;
	}//End of insert method
//Sorting linked list in accending order
	public int[] sort(int[] arr )
	{
	    int size=arr.length;
	    for(int i=size;i>0;i--)
		{
	    	for(int j=1;j<size;j++)
			{
		        if(arr[j-1]>arr[j])
				{
			        int temp=arr[j-1];
			        arr[j-1]=arr[j];
          			arr[j]=temp;
        		}
      		}
      		size--;
    	}
    	return arr;
  	}//End of sorting method
////Searching number
 	public boolean search(int search)	//search for item
	{
		NodeHash temp=head;
	 	if(temp==null)
	    	return false;
	  	while(temp!=null)
	  	{
	    	if(search==temp.data)
	    	{
	    		return true;
	    	}
	    	temp=temp.nextNode;
	  	}
	  	return false;
	}//end of searchList
//method to write in file
  	public void writeFile(NodeHash tNode)
	{
	    try
		{
            String tString="";
            File file=new File("/home/rgukt/workspace/com.bridgelabz.hashing/NewFile.txt");
            file.createNewFile();
            FileWriter fw=new FileWriter(file);
            while(tNode!=null){
              tString+=String.valueOf(tNode.data);
              tString+=" ";
              tNode=tNode.nextNode;
            }
            //System.out.println("string "+tString );
            fw.write(tString);
            fw.close();
          }
          catch(IOException e){
          }
      } //end of method
}
