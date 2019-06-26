package com.cg.pl;

public interface Validator {
	
	
	String employeenamepattern ="[a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-z]*+[_]+[j]+[o]+[b]";
	//salary any double
	String employeesalarypattern="[0-9]*+[.]*+[0-9]*";
	
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}
