package com.anurag.java8.practise;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Java8ReferenceExample {
	
	static Supplier<List<Student>> studentSupplier = StudentDataBase::getAllStudents;
	static Consumer<String> studentConsumer = System.out::println;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		StudentDataBase.getAllStudents().forEach((student->{
			studentConsumer.accept(student.getName());
		}));
	}

}
