package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.PasswordRule2;
import com.bridgelabz.program.PasswordRule3;

class PasswordRule3Test {

	@Test
	void test() {
		assertEquals(true,PasswordRule3.validPassword3("Chandan1"));
	}

}
