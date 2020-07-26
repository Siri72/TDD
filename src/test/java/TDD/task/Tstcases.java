package TDD.task;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;
public class Tstcases {

	@Test
	public void test() {
		App  t=new App ();
		String out=t.valid_string("ABCD");
		assertEquals("BCD",out);
	}
	@Test
	public void test1() {
		App  t=new App ();
		String out=t.valid_string("AACD");
		assertEquals("CD",out);
	}
	@Test
	public void test2() {
		App  t=new App ();
		String out=t.valid_string("BACD");
		assertEquals("BCD",out);
	}
	@Test
	public void test4() {
		App  t=new App ();
		String out=t.valid_string("BBAA");
		assertEquals("BBAA",out);
	}
	@Test
	public void test5() {
		App  t=new App ();
		String out=t.valid_string("AAAAAAAAAAA");
		assertEquals("AAAAAAAAA",out);
	}
	@Test
	public void test6() {
		App  t=new App ();
		String out=t.valid_string("AABAA");
		assertEquals("BAA",out);
	}

}