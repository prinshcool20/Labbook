package com.cg.pl;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[])
	{
		int a,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:-");
		a=scan.nextInt();
		sum=calculateSum(a);
		System.out.println("Final Sum="+sum);
	}
	

	private static int calculateSum(int n)
		{
			int sum=0;
			int a=1;
			for(a=1;a<=n;a++)
			{
				if(a%3==0||a%5==0)
				{
					sum=sum+a;
				}
			}
			return sum;
		}
	
}
