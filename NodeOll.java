package com.bridgelabz.util;
public class NodeOll<T>
{
	private int value;
	private NodeOll<T> next;
	//returns node value
	public int getValue()
	{
		return value;
	}
	//returns next node reference
	public NodeOll<T> getNext()
	{
		return next;
	}
	//set node value
	public void setValue(int value)
	{
		this.value=value;
	}
	//set node reference
	public void setNext(NodeOll<T> next)
	{
		this.next=next;
	}

}
