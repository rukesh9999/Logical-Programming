package PassByValueAndReferenceConcept;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Rukesh Gurram");
		emp1.setDesignation("Developer");
		emp1.setExperience(4);
		
		Employee emp2 = new Employee(2,"Aden alex", "team lead",5);
		
		int initialcount=0;
		
		int val=4;
		change(emp2,initialcount,val);
		
		System.out.println(emp2);
		System.out.println(val);
		
	}
	
	
	
	public static void change(Employee emp,int initialcount,int val) {
		
		String name = emp.getName();
		
		emp.setName(name.toLowerCase());
		
		emp.setDesignation(emp.getDesignation().toUpperCase());
		
		if(emp.getExperience()>initialcount) {
			val++;
		}
	
		
		
	}
	
	
	
}
