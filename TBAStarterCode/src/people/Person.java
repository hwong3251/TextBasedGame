package people;
import utilities.Utilities;

public class Person{
	
	private static String name;
	private static int age;
	
	public Person(String name,int age)
	{
		Person.name = name;
		Person.age = age; 
	}
	public static Person createPerson()
	{
		System.out.println("Hi, I am Sun. What is your name?");
		name = Utilities.getInput();
		System.out.println("Nice to meet you "+name + "! How old are you?");
		age = Utilities.getInt();
		System.out.println("Nice! " + age);
		return null;
	}
	public void Age()
	{
		System.out.println("How old are you?");
		age = Utilities.getInt();
	}
	public static String getFirstName()
	{
		return name;
	}
	public static int getAge()
	{
		return age;
	}
	
}
