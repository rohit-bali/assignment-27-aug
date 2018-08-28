class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black";
	void printColor()
	{
		System.out.println(color); 
		System.out.println(super.color);  
		
	}
}
class Cat extends Dog
{
	String color="Red";
	void print()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class TestSuper {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.printColor();
		c.print();

	}

}
