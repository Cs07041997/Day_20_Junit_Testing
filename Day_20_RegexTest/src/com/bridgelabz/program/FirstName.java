package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	public static boolean firstNameValidation(String firstName) {
		Scanner sc = new Scanner(System.in);
		
		return(Pattern.matches(("^[A-Z]{1}[a-z]{2,}$"), firstName));
        
	}


}
