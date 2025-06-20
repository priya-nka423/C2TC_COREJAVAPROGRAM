package day4.package3;

public class MyClass {
	private static MyClass obj=new MyClass();
	private int id;
	
	public int getId()
	{
		return id;
	}
	public static MyClass getObj() {
		return obj;
	}
	public static void setObj(MyClass obj) {
		MyClass.obj = obj;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	private MyClass() {
		System.out.println("MyClass object created");
	}
	public static MyClass getObject()
	{
		return obj;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	

}
