package com.myappzone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.myappzone.MyMaven;

public class MyMavenTest {
	
	private MyMaven myMaven;
	@Before
	public void setup(){
		myMaven = new MyMaven();
	}
	@Test
	public void testGetInt() {
		assertTrue(myMaven.getInt()<100);
	}
	@Test
	public void testGetInt2() {
		assertEquals(1, myMaven.getInt()/0);
	}

}
