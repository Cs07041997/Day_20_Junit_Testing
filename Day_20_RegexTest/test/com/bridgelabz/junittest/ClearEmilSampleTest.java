package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.ClearEmailSample;
import com.bridgelabz.program.PasswordRule2;

class ClearEmilSampleTest {

	@Test
	void test() {
		assertEquals(true,ClearEmailSample. validEmailSample("Chandan1997@gmail.com"));
	}

}
