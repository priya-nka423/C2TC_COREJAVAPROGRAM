package Entity;

public class CustomerEntity {
	private int Id;
	private String Name;
	private String City;
	
	public void setup(String Name,String City,int Id) {
		this.City=City;
		this.Name=Name;
		this.Id=Id;	
	}
	public int getId() {
		return Id;	
	}
	public String getName() {
		return Name;
	}
	public String getCity() {
		return City;
	}
	public String toString() {
		return "CustomerEntity [customerId=" + Id + ", customerName=" + Name + ", customerCity="
				+ City + "]";
	}
	
	

}
