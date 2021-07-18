package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule4 {
	public static boolean validPassword4(String password) {
		Scanner sc = new Scanner(System.in);
		
		return(Pattern.matches(("^(?=.[A-Za-z])(?=.\\\\d)(?=.[@$!%#?&])[A-Za-z\\\\d@$!%*#?&]{8}$"),password));
	}
	
}
