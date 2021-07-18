package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClearEmailSample {
	public static boolean validEmailSample(String emailSample) {
		Scanner sc = new Scanner(System.in);				
		return(Pattern.matches("^[a-zA-Z0-9_.][-][+][a-zA-Z0-9]@[a-zA-Z0-9]+([.][a-zA-Z]+)$", emailSample));
	}
}	

	

 
