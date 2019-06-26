package com.cg.pl;

import java.io.IOException;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) throws IOException 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int a=scan.nextInt();
		boolean x=checkNumber(a);
		if(x==true)
			System.out.println("Number "+a+":- is in power of 2");
		else
			System.out.println("Number "+a+":- is not in a power of 2");
		
	}

	private static boolean checkNumber(int x) {
		do
		{
			int y=0;
			y=x%2;
			x=x/2;
			if(y!=0)
				return false;
		}while(x>1);
		return true;
	}
}