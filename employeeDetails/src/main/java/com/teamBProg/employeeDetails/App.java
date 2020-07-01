package com.teamBProg.employeeDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Master Branch 
    	//Testing Purpose
    	//Development
    	Employee e1 = new Employee();
    	e1.setName("ram");
    	e1.setId(76);
    	e1.setSalary(8900.5);
    	
    	Employee e2 = new Employee();
    	e2.setName("Sam");
    	e2.setId(70);
    	e2.setSalary(8970.5);
    	
    	Employee e3 = new Employee();
    	e3.setName("deep");
    	e3.setId(1);
    	e3.setSalary(90000);
    	
    	List<Employee>employees =new ArrayList<>();
    	employees.add(e1);
    	employees.add(e2);
    	employees.add(e3);
    	
    	for(Employee e:employees) {
    		System.out.println("Employee Details ");
    		System.out.println("Name :"+ e.getName());
    		System.out.println("id :" +e.getId());
    		System.out.println("salary :" + e.getSalary());
    		System.out.println("*******************");
    	}
    	
    
    }
    
}
