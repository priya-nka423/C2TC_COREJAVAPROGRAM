package Polimorphism.overloading;

public class Square extends Shape{

	public Square(float area) {
		super.area=area;
	}
	@Override
	public void calArea()
	{
		System.out.println("From square class:"+super.areas);
	}

}

