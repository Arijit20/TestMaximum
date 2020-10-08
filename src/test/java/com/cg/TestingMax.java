package com.cg;

import org.junit.Test;

import com.cg.TestMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class TestingMax {
   
	@Test
	public void testMaxiumNumber() {
		Assert.assertEquals((Integer)8, TestMaximum.testMax(8, 4, 7));	
	}
}
