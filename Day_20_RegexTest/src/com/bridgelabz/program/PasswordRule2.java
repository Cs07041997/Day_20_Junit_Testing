package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule2 {
	public static boolean validPassword2(String password) {
		Scanner sc = new Scanner(System.in);
		
		return(Pattern.matches(("^[A-Z]{1}[a-z]{7,}$"), password ));
				
	}


}
