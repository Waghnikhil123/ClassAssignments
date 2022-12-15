package OopConcept;

import java.security.Permission;

class Person
{
	int id;
	String name, address;
	float marks=89.8f;
	public  Person(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;

	}
	void display()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("address: "+address);

	}
	
}
class Students extends Person
{
	float marks=70.0f;
	public Students(int id,String name,String address,float marks)
	{
		super(id,name,address);   //super is use to invoke imediate parent class constructor
		this.marks=marks;

	}
	void getData()
	{
		float marks =78.9f;
		super.display();   // to invoke parent display method
		System.out.println("local variable marks: "+marks);
		System.out.println("child student variable marks: "+this.marks);
		System.out.println("parent person variable marks: "+super.marks);

	}
}

public class SingleInheritance {
	public static void main(String []args)
	{
		Students obj =new Students(1,"nikhil","pune",90.9f);
		obj.display();
		System.out.println("******************************");
		obj.getData();
		
		
	}

}
