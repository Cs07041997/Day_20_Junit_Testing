package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.PasswordRule1;

class PasswordRule1Test {

	@Test
	void test() {
		assertEquals(true,PasswordRule1.validPassword1("Chandans"));
	}

}
