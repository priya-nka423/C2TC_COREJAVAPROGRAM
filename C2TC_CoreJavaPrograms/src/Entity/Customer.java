package Entity;

public class Customer {

	public static void main(String[] args) {
           CustomerEntity obj=new CustomerEntity();
           obj.setup("Priyanka","Chennai", 79);
           System.out.println(obj.getId());

           System.out.println(obj.getName());

           System.out.println(obj.getCity());
	}

}
