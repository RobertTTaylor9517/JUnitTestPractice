package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//ABCD => false, ABAB => true, AB => true, A => false
@RunWith(Enclosed.class)
public class ParameterizedStringHelperTestBoolean {

	@RunWith(Parameterized.class)
	public static class FalseTest {

		StringHelper helper = new StringHelper();

		@Parameters
		public static String[] data() {
			String expected[] = { "ABCD", "A" };
			return expected;
		}

		private String input;

		public FalseTest(String input) {
			super();
			this.input = input;
		}

		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicFalse() {
			assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
		}

	}

	@RunWith(Parameterized.class)
	public static class TrueTest {
		StringHelper helper = new StringHelper();

		@Parameters
		public static String[] data() {
			String expected[] = { "ABAB", "AB" };
			return expected;
		}

		private String input;

		public TrueTest(String input) {
			super();
			this.input = input;
		}

		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicTrue() {
			assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
		}
	}
}
