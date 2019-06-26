package com.cg.pl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Map<Integer,String> hsmp = new HashMap<Integer,String>();
		System.out.println("Enter Number of Elements:-");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i = 0; i<a;i++)
		{
			System.out.println("Enter id of"+i+"Element");
			int id = scan.nextInt();
			System.out.println("Enter name of"+i+"Element");
			String data = scan.next();
			hsmp.put(id, data);
		}
		
		List<String> l = getValues(hsmp);
		
		for(String b : l) {
			System.out.println(b);
		}
		
		
		

	}

	private static List getValues(Map<Integer, String> hsmp) {
		Collection<String> vc = hsmp.values();
		List<String> ls = new ArrayList<String>(vc);
		Collections.sort(ls);
		return ls;
	}

}
