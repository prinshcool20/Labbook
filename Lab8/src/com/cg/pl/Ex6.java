package com.cg.pl;

import java.time.*;
import java.util.*;

public class Ex6 {  
   public static void main(String[] args)
   
    {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter Day in numbers");
	   int dd=scan.nextInt();
	   System.out.println("Enter Month in numbers");
	   int mon=scan.nextInt();
	   System.out.println("Enter year in numbers");
	   int yyyy=scan.nextInt();
        
	   
	    LocalDate pdate = LocalDate.of(yyyy, mon, dd);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
