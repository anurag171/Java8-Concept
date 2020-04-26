package com.anurag.java8.practise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamExample {

	public static void main(String[] args) {
		Predicate<Student> gradepredicate = (student)->student.getGradeLevel()>2;
		Predicate<Student> gpapredicate = (student)->student.getGpa()>2;
		long startTime = System.currentTimeMillis();
		Map<String,List<String>> map = StudentDataBase.getAllStudents().parallelStream().
		filter(gradepredicate).
		filter(gpapredicate).collect(Collectors.toMap(Student::getName, Student::getActivities));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(map);
		
		long startTime1 = System.currentTimeMillis();
		Map<String,List<String>> map1 = new HashMap();
		for(Student student:StudentDataBase.getAllStudents()) {
			if(student.getGradeLevel()>2) {
				if(student.getGpa()>2) {
					map1.put(student.getName(), student.getActivities());
				}
			}
		}		
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-startTime1);
		System.out.println(map);
		
	}

}
