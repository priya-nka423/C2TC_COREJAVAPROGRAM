package Entity.EntityNew;

public class StudentsDemo {

	public static void main(String[] args) {
           Students stud=Students.getObj();
           
           stud.setSid(101);
           stud.setSname("Priya");
           
           Students  stud1=Students.getObj();
           System.out.println(stud1);
           System.out.println(stud);
	}

}
