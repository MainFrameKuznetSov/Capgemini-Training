package com.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class juntTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		Junt j=new Junt();
		int actualAns=j.add(2,3);
		int expectedAns=6;
		assertEquals(expectedAns,actualAns);
	}

}
