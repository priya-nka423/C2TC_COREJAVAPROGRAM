package Entity;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Name:");
		String name=sc.nextLine();
		
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		
		System.out.print("Enter your salary:");
		double salary=sc.nextDouble();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
	}

}
