package Polimorphism.overloadingexample;

public class Executor {

	public static void main(String[] args) {
		System.out.println("1.Addition:"+OverloadingExample.additon("hello","world"));
		System.out.println("2.Addition:"+OverloadingExample.additon(12,100));
		System.out.println("3.Addition:"+OverloadingExample.additon(10,4.67f));
		System.out.println("4.Addition:"+OverloadingExample.additon(35.8f,156));
		System.out.println("5.Addition:"+OverloadingExample.additon(89.7f,56.3f));
		
		Person p1=new Person();// default constructor
		System.out.println(p1);
		
		p1=new person(101,"Priya");// 2 parameter constructor
		System.out.println(p1);
		
		p1=new Person(102,"Ragz","Chennai");//3 parameter constructor
		System.out.println(p1);
	}

}
