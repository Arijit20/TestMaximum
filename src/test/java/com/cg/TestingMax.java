package com.cg;

import org.junit.Test;

import com.cg.TestMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class TestingMax {
   
	@Test
	public void testMaximumIntegerAtFirst() {
		Assert.assertEquals((Integer)8, TestMaximum.testMax(8, 4, 7));	
	}
	@Test
	public void testMaximumIntegerAtSecond() {
		Assert.assertEquals((Integer)20, TestMaximum.testMax(4, 20, 7));	
	}
	@Test
	public void testMaximumIntegerAtThird() {
		Assert.assertEquals((Integer)45, TestMaximum.testMax(4, 20, 45));	
	}
	
	@Test
	public void testMaximumFloatAtFirst() {
		Assert.assertEquals((Float)4.6f, TestMaximum.testMax(4.6f, 4.5f, 2.6f));	
	}
	@Test
	public void testMaximumFloatAtSecond() {
		Assert.assertEquals((Float)5.2f, TestMaximum.testMax(4.6f, 5.2f, 1.7f));	
	}
	@Test
	public void testMaximumFloatrAtThird() {
		Assert.assertEquals((Float)9.9f, TestMaximum.testMax(4.8f, 8.0f, 9.9f));	
	}
}

