package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule1 {
	public static boolean validPassword1(String password) {
		Scanner sc = new Scanner(System.in);
		
		return(Pattern.matches(("^[A-Za-z]{8}$"), password ));
				
	}

}	

