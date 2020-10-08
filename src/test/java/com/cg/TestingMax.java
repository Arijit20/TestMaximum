package com.cg;

import org.junit.Test;

import com.cg.TestMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class TestingMax {
   
	@Test
	public void testMaxiumNumberAtFirst() {
		Assert.assertEquals((Integer)8, TestMaximum.testMax(8, 4, 7));	
	}
	@Test
	public void testMaxiumNumberAtSecond() {
		Assert.assertEquals((Integer)20, TestMaximum.testMax(4, 20, 7));	
	}
}

