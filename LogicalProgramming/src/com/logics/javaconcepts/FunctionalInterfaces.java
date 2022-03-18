package com.logics.javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		List<Student> listOfStudents = new ArrayList<Student>();
        
		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
		         
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
		         
		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
		         
		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
		         
		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
		         
		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
		         
		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
		         
		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
		         
		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
		         
		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
		//use of predicate
		
		Predicate<Student> predicate = s->s.getSpecialization().equals("Mathematics");
		
		ArrayList<Student> mathematicsStudents = new ArrayList<>();
		for(Student s : listOfStudents)
		{
			if(predicate.test(s))
			{
				mathematicsStudents.add(s);
			}
		}
		
		
		//use of consumer
		ArrayList<String> nameandspec = new ArrayList<>();

		Consumer<Student> consumer = s->{
			String name = s.getName()+"::::"+s.getPercentage();
			nameandspec.add(name);
		};
		
		for(Student s: listOfStudents)
		{
			consumer.accept(s);
		}
		
		System.out.println(nameandspec);
		
		
		//use of function
		
		Function<Student, String> function =s->s.getName();
		ArrayList<String> studentNames = new ArrayList<>();
		
		for(Student s:listOfStudents) {
			studentNames.add(function.apply(s));	
		}
		
		//use of supplier
		
		Supplier<Student> supplier =()->new Student(1111, "johnalex", 79.8, "Computers");
		
		listOfStudents.add(supplier.get());
	}
}
