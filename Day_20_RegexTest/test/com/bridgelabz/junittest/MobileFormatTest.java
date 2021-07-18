package com.bridgelabz.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.MobileFormat;

class MobileFormatTest {

	@Test
	void test() {
		assertEquals(true,MobileFormat.validMobileFormat("91-7221804239"));
	}

}
