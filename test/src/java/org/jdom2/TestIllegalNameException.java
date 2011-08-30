package org.jdom2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIllegalNameException {

	@Test
	public void testIllegalNameExceptionStringStringString() {
		assertTrue (null != 
				new IllegalNameException("name", "construct", "reason").getMessage());
	}

	@Test
	public void testIllegalNameExceptionStringString() {
		assertTrue (null != 
				new IllegalNameException("name", "construct").getMessage());
	}

	@Test
	public void testIllegalNameExceptionString() {
		assertTrue (null != 
				new IllegalNameException("reason").getMessage());
	}

}
