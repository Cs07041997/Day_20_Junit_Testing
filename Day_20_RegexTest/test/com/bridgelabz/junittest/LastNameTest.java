package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.bridgelabz.program.LastName;

class LastNameTest {

	@Test
	void test() {
		assertEquals(true, LastName.lastNameValidation("kumar"));
	}

}
