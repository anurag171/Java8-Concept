package com.anurag.java8.practise;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		Comparator<Integer> comparator = (Integer a, Integer b) -> a.compareTo(b);
		comparator.compare(1, 2);
	}

}
