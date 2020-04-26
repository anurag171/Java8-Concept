package com.anurag.java8.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Java8Bean implements Formula{
	
	public static void executeLambdaThread() {
		Runnable runnbale =()-> {System.out.println("This is thread1");	};
		new Thread(runnbale).start();
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (a,b)->b.compareTo(a));
		System.out.println(names);		
	}

	@Override
	public double calculate(int a) {
		
		return sqrt(100*a);
	}
}
