package pt2.testInherit;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String str, int n)
	{
		this.color = str;
		this.speed = n;
	}
	
	public void show()
	{
		System.out.println("ėė : " + color + "\nėë" + speed);
	}
}
