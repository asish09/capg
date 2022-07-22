package com.demo.samples;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1996;
		boolean l=false;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					l=true;
				else 
					l=false;
				
			}
			else 
				l=true;
			
		}
		else
			l=false;
		if(l)
			System.out.println(year+"is a leap year");
		else
			System.out.println(year+"is not a leap year");

	}

}
