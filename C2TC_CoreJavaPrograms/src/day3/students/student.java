package day3.students;

public class student {
     private int id;
     private String name;
     private String course;
     student()
     {
    	 System.out.println("I am default constructor");
     }
     student(int id)
     {
    	 System.out.println("ID:"+id);
     }
     student(String sname,String course)
     {
    	 System.out.println("Name: " +name+ " Course: "+course);
     }
     
     

}
