package com.anurag.java8.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.anurag.java8.practise.Java8Bean;
@SpringBootApplication
@ComponentScan("com.anurag.java8.practise")
public class Java8practiceApplication {
	
	@Autowired
	private static Java8Bean _java8Bean;

	public static void main(String[] args) {
		SpringApplication.run(Java8practiceApplication.class, args);
		_java8Bean.executeLambdaThread();
		System.out.println(_java8Bean.calculate(20));
		System.out.println(_java8Bean.sqrt(20));
	}

}
