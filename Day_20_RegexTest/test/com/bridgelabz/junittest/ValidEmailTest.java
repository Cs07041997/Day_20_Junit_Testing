package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.PasswordRule2;
import com.bridgelabz.program.ValidEmail;

class ValidEmailTest {

	@Test
	void test() {
		assertEquals(true,ValidEmail.validEmail("Chandan1997@gmail.com"));
	}

}
