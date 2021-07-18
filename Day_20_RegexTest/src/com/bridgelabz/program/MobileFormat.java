package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormat {
	
	public static boolean validMobileFormat(String mobileformat) {
		Scanner sc = new Scanner(System.in);
		
		return(Pattern.matches(("^[9][1][-][0-9]{10,}$"),mobileformat ));
        
	}

}
