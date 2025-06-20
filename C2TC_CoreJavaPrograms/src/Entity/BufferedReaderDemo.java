package Entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		String name=reader.readLine();
		
		System.out.println("Enter your age:");
		int age=Integer.parseInt(reader.readLine());
		
		System.out.println("Enter your salary:");
		double salary=Double.parseDouble(reader.readLine());
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		
	}

}
