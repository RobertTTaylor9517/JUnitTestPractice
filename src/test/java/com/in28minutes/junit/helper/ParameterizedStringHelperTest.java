package com.in28minutes.junit.helper;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedStringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expected;
	
	
	public ParameterizedStringHelperTest(String input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][]={{"AACD", "CD"},{"ACD", "CD"}};
		return Arrays.asList(expectedOutputs);
	}

	//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
		//(expected, actual)
	}
	
//	@Test
//	public void testTruncateAInFirst2Positions_AinFirst() {
//		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
//	}
	
//	@Test
//	public void testTruncateAInFirst2Positions_NoA() {
//		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
//	}
//	
//	@Test
//	public void testTruncateAInFirst2Positions_2ALast() {
//		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
//	}
}
