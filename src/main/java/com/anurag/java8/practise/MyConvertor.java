package com.anurag.java8.practise;

@FunctionalInterface
public interface MyConvertor<F, T> {	
	T convert(F from);
}
