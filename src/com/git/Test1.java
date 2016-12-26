package com.git;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		int a=GitSample.add(3, 5);
		assertEquals(a,8);
	}

}
