package com.cg;

import org.junit.Test;

import com.cg.TestMaximum;

import static org.junit.Assert.*;

import org.junit.Assert;

public class TestingMax {
   
   @Test
   public void testInteger() {
	   TestMaximum<Integer> test = new TestMaximum<Integer>(23, 54, 89, 74, 52, 65, 48, 98, 100);
	   Assert.assertEquals((Integer)100, test.max());
   }
   @Test
   public void testFloat() {
	   TestMaximum<Float> test = new TestMaximum<Float>(5.3f, 5.6f, 8.4f, 7.2f, 9.1f);
	   Assert.assertEquals((Float)9.1f, test.max());
   }
   @Test
   public void testString() {
	   TestMaximum<String> test = new TestMaximum<String>("apple", "banana", "grapes", "pineapple");
	   Assert.assertEquals("pineapple", test.max());
   }
}

