package kr.or.javacafe.core.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RequestUtilTest {

	@Test
	public void test() {
		assertEquals("HELLO", RequestUtil.getHello());
	}
}
