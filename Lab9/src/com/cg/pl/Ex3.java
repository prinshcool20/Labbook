package com.cg.pl;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = new int[a];
		for(int i = 0 ; i < a ; i++)
		{
			System.out.println("Enter the "+i+" Element");
			b[i] = scan.nextInt();
		}
		getSquares(b);

	}
	public static void getSquares(int a[]) {
		Map <Integer,Integer> hsmp = new HashMap<Integer,Integer>();
		int sqr = 0;
		int len = a.length;
			for(int i = 0 ; i < len; i++ )
			{
				hsmp.put(a[i], a[i]*a[i]);
			}
			for (Map.Entry entry : hsmp.entrySet()) { 
				System.out.println(entry.getKey() + " " + entry.getValue()); 
			
	}

}
}
