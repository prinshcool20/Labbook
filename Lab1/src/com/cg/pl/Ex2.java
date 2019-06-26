package com.cg.pl;

import java.util.Scanner;
import java.io.IOException;
import java.lang.*;

public class Ex2 {
	public static void main(String args[]) throws IOException
	{
		
		int dif=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int a=scan.nextInt();
		dif=calcualteDifference(a);
		System.out.println("Final Answer= "+dif);
	}

	private static int calcualteDifference(int n) {
		int dif=0,sum1=0,sum2=0;
		for(int c=1;c<=n;c++)
		{
			sum1=sum1+(int)Math.pow(c,2);
			sum2=sum2+c;
		}
		sum2=(int)Math.pow(sum2,2);
		dif=sum1-sum2;
		return dif;
	}
}
