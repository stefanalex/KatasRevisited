package com.warpit.arraystack.reversestream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverseString = new ReverseString();
		
		assertThat(reverseString.reverseString("1234567890")).isEqualTo("0987654321");
	}

}
