package com.cg.pl;

import java.util.Scanner;

public class Ex3 {
	static boolean isPrime(int n) 
	{ 
	// Corner case 
	if (n <= 1) 
	    return false; 
	  
	// Check from 2 to n-1 
	for (int i = 2; i < n; i++) 
	    if (n % i == 0) 
	        return false; 
	  
	return true; 
	} 
	  
	// Function to print primes 
	static void printPrime(int n) 
	{ 
	for (int i = 2; i <= n; i++)  
	{ 
	    if (isPrime(i)) 
	        System.out.print(i + " "); 
	} 
	}
	public static void main (String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number :- ");
		int n=scan.nextInt();
		printPrime(n); 
		
		
	}
}
