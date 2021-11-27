package com.logics.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {
		
		Employee employee1 =new Employee(1,"ravi",14,2000,"HR");
		Employee employee2 =new Employee(2,"nani",14,3000,"HR");
		Employee employee3 =new Employee(3,"roopa",12,2000,"QA");
		Employee employee4 =new Employee(4,"tulasi",12,3000, "QA");
		Employee employee5 =new Employee(5,"rukesh",15,5000, "DEV");
		Employee employee6 =new Employee(6,"ganesh",15,5000, "DEV");
		Employee employee7 =new Employee(7,"maahi",15,5000, "Support");
		Employee employee8 =new Employee(8,"alex",18,7000, "Support");
		Employee employee9 =new Employee(9,"manitha",18,7000, "Support");
		
		
		List<Employee> employeelist = new ArrayList<>();
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		employeelist.add(employee4);
		employeelist.add(employee5);
		employeelist.add(employee6);
		employeelist.add(employee7);
		employeelist.add(employee8);
		employeelist.add(employee9);
		
		
		//employeelist.stream().forEach(System.out::println);
		
		//System.out.println(".......................");
		
		//employeelist.stream().limit(4).forEach(System.out::println);
		//System.out.println(".......................");
		
		//employeelist.stream().filter(e->e.getDepartment().equalsIgnoreCase("HR")).forEach(System.out::println);
		
		//System.out.println(".......................");
		//System.out.println(employeelist.stream().count());
		
		   Map<String, Long>   empmap =  employeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		   
		   System.out.println(empmap);
		   
		   
		   Map<String, Set<String>>   empdeptmap =  employeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toSet())));
		   
		   System.out.println(empdeptmap);
		  /* for(Entry<Double, List<Employee>> entry :  empmap.entrySet())
		   {
			   if(entry.getKey().equals(5000.0))
			   {
				  List<Employee> emplist =  entry.getValue();
				 // emplist.stream().forEach(System.out::println);
			   }
			  
		   }*/
		   
		   
		    List<Integer> numlist = Arrays.asList(new Integer[] {1,2,3,3,4,6,7,5,8,4,5,7,8,9,0,1,0,0,1,0,2,3,4,4,5,6,7,8,8});
		  
		   Map<Integer, Long> resmap =  numlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))  ;
		   System.out.println(resmap);
		   // int sum = numlist.stream().mapToInt(num->num).sum();
		   //System.out.println(sum);
		   int sum =  (int) numlist.stream().reduce(0,Integer::sum);
		  // System.out.println(sum);
		   
		   
		  Map<String, Double> empMap =  employeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
		   
		  System.out.println(empMap);
		  
		   
	}
}
