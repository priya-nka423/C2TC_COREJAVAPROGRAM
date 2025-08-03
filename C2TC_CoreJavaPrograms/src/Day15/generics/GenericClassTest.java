package Day15.generics;

import day3.ScannerDemo.Person;

public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<String> stringObj=new GenericClass<String>();
		stringObj.set("Hello");
		System.out.println(stringObj.get());

		//GenericClass with Integer type of data member
		GenericClass<Integer> integerObj=new GenericClass<Integer>();
		integerObj.set(10);
		System.out.println(integerObj.get());
		
		//GenericClass with Person object of data member
		GenericClass<Person> personObj=new GenericClass<Person>();
		personObj.set(new Person("Ajay","Chennai"));
		System.out.println(personObj.get());
	}
	}
