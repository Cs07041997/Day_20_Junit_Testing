package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.PasswordRule1;
import com.bridgelabz.program.PasswordRule2;

class PasswordRule2Test {

	@Test
	void test() {
		assertEquals(true,PasswordRule2.validPassword2("Chandans"));
	}

}
