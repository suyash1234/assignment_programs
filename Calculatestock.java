package com.bridgelabz.task;
public class Calculatestock
{
	//main method
	public static void main(String str[])
	{
		//stock1 details
		Shareprice sp1=new Shareprice();
		sp1.setCount(2);
		sp1.setPrice(200);
		Shareprice sp2=new Shareprice();
		sp2.setCount(3);
		sp2.setPrice(400);
		//calling methods for stock1
		int share1total=calculateValue(sp1);
	    int share2total=calculateValue(sp2);
		int totalstock1=share1total + share2total;
		System.out.println("share1 value is =" +share1total);
	    System.out.println("share2 value is =" +share2total);
	 	System.out.println("stock1 value is =" +totalstock1);
		//stock2 details
		Shareprice sp3=new Shareprice();
		sp3.setCount(2);
		sp3.setPrice(200);	
		Shareprice sp4=new Shareprice();
		sp4.setCount(3);
		sp4.setPrice(400);	
		//calling methods for stock2	
		int share3total=calculateValue(sp3);
    	int share4total=calculateValue(sp4);
		int totalstock2=share3total + share4total;
		System.out.println("share3 value is =" +share3total);
    	System.out.println("share4 value is =" +share4total);
		System.out.println("stock2 value is =" +totalstock2);
		//calculate value of total stock	
    	int Totalstock= totalstock1 + totalstock2;
		System.out.println("Total stock is =" +Totalstock);
	}
		//called method declaration
		public static int calculateValue(Shareprice sp)
        	{     
			int count=sp.getCount();
			int price=sp.getPrice();
			int sharevalue=count*price;
	        return sharevalue;
	
            }
}
