package com.logics.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WorkerMain {

	public static void main(String[] args) {
		
		List<Worker> workers = new ArrayList<>();
		workers.add(new Worker(1, "navi", "male", 25, "ECE", 2001, 24000));
		workers.add(new Worker(2, "hari", "male", 25, "EEE", 2011, 58000));
		workers.add(new Worker(3, "euka", "female", 21, "EEE", 2011, 27000));
		workers.add(new Worker(4, "dani", "male", 21, "EEE", 2011, 26000));
		workers.add(new Worker(5, "ravi", "male", 26, "ECE", 2011, 23000));
		workers.add(new Worker(6, "tanu", "female", 20, "MEC", 2001, 29000));
		workers.add(new Worker(7, "guru", "male", 26, "MEC", 2013, 55000));
		workers.add(new Worker(8, "chaitu", "female", 20, "MEC", 2013, 27000));
		workers.add(new Worker(9, "sabi", "female", 20, "MEC", 2013, 64000));
		workers.add(new Worker(10, "navi", "male", 26, "ECE", 2013, 63000));
		workers.add(new Worker(11, "gaya", "female", 27, "CSC", 2013, 20000));
		workers.add(new Worker(12, "janani", "female", 20, "CSC", 2001, 21000));
		workers.add(new Worker(13, "vavi", "female", 27, "CSC", 2015, 62000));
		workers.add(new Worker(14, "jaya", "female", 28, "CSC", 2015, 33000));
		workers.add(new Worker(15, "alex", "male", 22, "ECE", 2015, 40000));
		workers.add(new Worker(16, "tula", "female", 22, "ECE", 2001, 67000));
		workers.add(new Worker(17, "nani", "male", 21, "ECE", 2001, 59000));
     
		// how many male and female workers are there in the organization
		Map<String, Long> genderCount = workers.stream().collect(Collectors.groupingBy(Worker::getGender,Collectors.counting()));
		System.out.println(genderCount);
		
		//print the name of all departments in the organization
		Set<String> nameOfAllDepartments = workers.stream().map(Worker::getDepartment).collect(Collectors.toSet());
		System.out.println(nameOfAllDepartments);
		
	
		//what is the average age of male and female employees 
		 Map<String, Double> avgAge = workers.stream()
				 .collect(Collectors.groupingBy(Worker::getGender,Collectors.averagingLong(Worker::getAge)));
		System.out.println(avgAge);
		
		// Get the details of highest paid employee in the organization?
		
		Comparator<Worker> workercomp = (w1,w2)->Double.compare(w2.getSalary(), w1.getSalary());
		
		List<Worker> highestPaidEmployee = workers.stream().sorted(workercomp).limit(1).collect(Collectors.toList());
		System.out.println(highestPaidEmployee);
		
		//Get the names of all employees who have joined after 2011?
		
		Set<String> workerNamesJoinedAfter2015 = workers.stream().filter(worker->worker.getYearOfJoining()>2011).map(worker->worker.getName()).collect(Collectors.toSet());
		System.out.println(workerNamesJoinedAfter2015);
		
		//Count the number of employees in each department?
		Map<String, Long> employeesInEachDept = workers.stream().collect(Collectors.groupingBy(Worker::getDepartment,Collectors.counting()));
		System.out.println(employeesInEachDept);
		
		//What is the average salary of each department?
		Map<String, Double> avgSalOfEachDept = workers.stream().collect(Collectors.groupingBy(Worker::getDepartment,Collectors.averagingDouble(Worker::getSalary)));
		System.out.println(avgSalOfEachDept);
		
		//Get the details of youngest male employee in the product development department?
		//Who has the most working experience in the organization?
		
		//How many male and female employees are there in the ECE and EEE team?
		
		
		//What is the average salary of male and female employees?
		Map<String, Double> avgSalOfMaleAndFemale = workers.stream().collect(Collectors.groupingBy(Worker::getGender,Collectors.averagingDouble(Worker::getSalary)));
		System.out.println(avgSalOfMaleAndFemale);
		
		// List down the names of all employees in each department?
		Map<String, Set<String>> collect = workers.stream().collect(Collectors.groupingBy(Worker::getDepartment,Collectors.mapping(Worker::getName, Collectors.toSet())));
		System.out.println(collect);
	}
}
