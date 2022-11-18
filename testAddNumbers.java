package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junitnumbers = new jUnitFunctions();
		int result = junitnumbers.addNumbers(100, 200);
		assertEquals (300, result);
	}

}
