package Polimorphism.overloadingexample;

public class Person {
	private int pid;
	private String name;
	private String city;
	
	public Person() {
		this.pid=100;
		this.name="Priya";
		this.city="chennai";
		
	}
	public Person(int pid,String name)
	//only 2 parameters
	{
		this.pid=pid;
		this.name=name;
		
	}
	public Person(int pid,String name,String city)
	//only 3 parameters
	{
		this.pid=pid;
		this.name=name;
		this.city=city;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	

}
