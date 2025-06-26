package day8.interfaces.instanceofinterface;

public class Samsunug implements Phone {
	@Override
	public void call() {
		System.out.println("Calling using samsung");
	}
	@Override
	public void sms() {
		System.out.println("Messaging using samsung");
	}
}
