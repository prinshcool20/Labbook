package com.cg.pl;

import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) throws IOException 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int a=scan.nextInt();
		boolean x=checkNumber(a);
		if(x==true)
			System.out.println("This is in Increasing Order");
		else
			System.out.println("This is not in Increasing Order");
		
	}

	private static boolean checkNumber(int x) {
		do
		{
		int y=0,z=0;
		y=x%10;
		x=x/10;
		z=x%10;
		if(z>y)
			return false;
		}while(x>0);
		return true;
	}
}
