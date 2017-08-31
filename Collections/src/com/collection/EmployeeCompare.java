package com.collection;

import java.util.Comparator;

public class EmployeeCompare implements Comparable<EmployeeCompare> {


    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public EmployeeCompare(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overriden to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

	@Override
	public int compareTo(EmployeeCompare emp) {
		// TODO Auto-generated method stub
		return (this.id-emp.id);
	}
	
	
	public static Comparator<EmployeeCompare> salarycomparator=new Comparator<EmployeeCompare>() 
	{

		@Override
		public int compare(EmployeeCompare o1, EmployeeCompare o2) {
			// TODO Auto-generated method stub
			return (int)(o1.getSalary()-o2.getSalary());
		}
	};

	public static Comparator<EmployeeCompare> namecomparator = new Comparator<EmployeeCompare>() {
		
		@Override
		public int compare(EmployeeCompare o1, EmployeeCompare o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};

}
