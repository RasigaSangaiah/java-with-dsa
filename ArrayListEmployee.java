

import java.util.*;
class Employee{
    int id;
    String name;
    String designation;
    Employee(int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
    }
}
class ArrayListEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee(1,"Arun","HR"));
        emplist.add(new Employee(2,"balu","Senior manager"));
        emplist.add(new Employee(3,"Hari","Manager"));
        System.out.println("Employee Details");
        System.out.println("----------------------------------");
		//for eacg loop to print
        for (Employee emp:emplist){
            System.out.println("Employee id:  "+emp.id);
            System.out.println("Employee name:  "+emp.name);
            System.out.println("Employee Designation:  "+emp.designation);
        }
		//another for loop to print
		for (int i=0;i<emplist.size();i++){
			Employee emp=emplist.get(i);
            System.out.println("Employee id:  "+emp.id);
            System.out.println("Employee name:  "+emp.name);
            System.out.println("Employee Designation:  "+emp.designation);
        }
        
    }
}