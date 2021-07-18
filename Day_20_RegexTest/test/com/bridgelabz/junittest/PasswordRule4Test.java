package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.PasswordRule2;
import com.bridgelabz.program.PasswordRule4;

class PasswordRule4Test {

	@Test
	void test() {
		assertEquals(true,PasswordRule4.validPassword4("chandan@"));
	}

}
