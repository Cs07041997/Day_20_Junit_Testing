package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.FirstName;

class FistNameTest {

	@Test
	void test() {
		assertEquals(true, FirstName.firstNameValidation("Chandan"));
	}

}
