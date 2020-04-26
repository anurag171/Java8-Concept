package com.anurag.java8.practise;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateExample {
	static Predicate<Integer> p1 = (i) ->(i%2==0);
	static Predicate<Integer> p2 = (i) ->(i%5==0);
	static Predicate<Integer> p3 = (i) ->(i%8==0);
	//predicate for student elements having gpa>2
	static Predicate<Student> p4 = (student) -> (student.getGpa()>2);
	//predicate for student elements having grade level >3
	static Predicate<Student> p5 = (student) -> (student.getGradeLevel()>3);
	//Create bi consumer to print name and activities
	BiConsumer<String, List<String>> stndtConsumer = (name,activities)->System.out.println(name+":"+activities);
	
	//Bipredicate
	BiPredicate<Integer, Double> bipredicate = (gradelevel,gpa)->gradelevel>2 && gpa>=3;
	
	//Create consumer with filter of predicate p4 and p5
	Consumer<Student> studentConsumer = (student->{
		if(bipredicate.test(student.getGradeLevel(),student.getGpa())) {
			stndtConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	private void printNameAndActivities(List<Student> students) {
		System.out.println("Wonderful Predicate & Consumer Example");
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		
		System.out.println(p1.test(7));
		System.out.println(p1.and(p2).or(p3).test(30));
		System.out.println(p2.negate().test(44));
		//
		new PredicateExample().printNameAndActivities(StudentDataBase.getAllStudents());

	}

}
