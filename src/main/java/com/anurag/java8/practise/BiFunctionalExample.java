package com.anurag.java8.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiFunctionalExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>>
	bifunc = ((students,studentPredicate)->{
		Map<String,Double> myMap = new HashMap();
		students.forEach(student->{
			if(studentPredicate.test(student)) {
				myMap.put(student.getName(),student.getGpa());
			}
		});
		return myMap;
	});
	
	static Supplier<Student> supplier = ()->{
		return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
	};
	
	static Supplier<List<Student>> studentSupplier = ()-> StudentDataBase.getAllStudents();
	public static void main(String[] args) {
		System.out.println(bifunc.apply(StudentDataBase.getAllStudents(), PredicateExample.p4.and(PredicateExample.p5)));
		System.out.println(supplier.get());
		System.out.println(studentSupplier.get());

	}

}
