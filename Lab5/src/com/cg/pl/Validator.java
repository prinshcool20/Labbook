package com.cg.pl;

public interface Validator {
	
	String employeename ="[a-zA-Z]*+[']*[.]*[ ]*+[a-zA-Z]*+[ ]*+[a-zA-Z]*";
	
	String employeeage="[0-9]*+[.]*+[0-9]*";
	
	String employeesalary="[0-9]*+[.]*+[0-9]*";
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}
