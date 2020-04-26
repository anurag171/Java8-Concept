package com.anurag.java8.practise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FunctionalInterfaceExample {
	
	static Function<String, String> function = (name)->name.toUpperCase();
	static Function<String, String> andSomeString = (name)->name.concat("Default");
	static Function<List<Student>, Map<String,Double>> studentFunction = (students->{
		Map<String,Double> studentGradeMap = new HashMap();
		students.forEach(student->{
			studentGradeMap.put(student.getName(),student.getGpa());
		});
		return studentGradeMap;
	});

	public static void main(String[] args) {
		System.out.println(function.apply("java8"));
		System.out.println(function.andThen(andSomeString).apply("java8"));
		System.out.println(function.compose(andSomeString).apply("java8"));
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

	}

}
