package com.anurag.java8.practise;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (s)->System.out.println(s.toUpperCase());
		consumer.accept("goa");
	}
}
