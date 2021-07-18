package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
	public static boolean validEmail(String email) {
		Scanner sc = new Scanner(System.in);
		
		return(Pattern.matches(("^[A-Za-z0-9+_.-]+@(.+)$"), email ));
		
	}

}

