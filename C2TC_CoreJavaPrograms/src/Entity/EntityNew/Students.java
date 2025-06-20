package Entity.EntityNew;

public class Students {
	private static Students obj =new Students();
	
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public static Students getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + "]";
	}
	public static Students get(){
	return obj;
	}

}