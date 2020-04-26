/**
 * 
 */
package com.anurag.java8.practise;

/**
 * @author COMPAQ
 *
 */
@FunctionalInterface
public interface Formula {
	
	double calculate(int a);
	
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
