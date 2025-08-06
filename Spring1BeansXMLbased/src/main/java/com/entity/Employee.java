package com.entity;

public class Employee {                //POJO plan old java object
	
	//filed are private..
	private int eid;
	private String name;
	private String salary;
	private String city;
	
 //Constructor...
	public Employee() {
		
	}
	public Employee(int eid, String name, String salary,String city) {
		super();
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.city=city;
	}
	
	
  //public getter and setter method..	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary=salary;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	

  //toString method covert object into string
		@Override
		public String toString() {
			return "Employee[eid="+eid+",name="+name+",salary="+salary+",city="+city+"]";
		
			
		}

}
