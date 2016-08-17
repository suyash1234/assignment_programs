package com.bridgelabz.util;
public class Node1<T>
{
	private int value;
	private Node1<T> next;
	//returns node value
	public int getValue()
	{
		return value;
	}
	//returns next node reference
	public Node1<T> getNext()
	{
		return next;
	}
	//set node value
	public void setValue(int value)
	{
		this.value=value;
	}
	//set node reference
	public void setNext(Node1<T> next)
	{
		this.next=next;
	}

}
