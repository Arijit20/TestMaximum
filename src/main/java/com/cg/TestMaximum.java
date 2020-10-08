package com.cg;

public class TestMaximum <E extends Comparable<E>>{
	
	E a, b, c;
	
	public TestMaximum(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static <E extends Comparable<E>> E testMax(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
}
