package OopConcept;
class Person1
{
	int id;
	String name, address;
	float marks=89.8f;
	public  Person1(int id,String name,String address)
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
class Studentdet extends Person1
{
	float marks;
	public Studentdet(int id,String name,String address,float marks)
	{
		super(id,name,address);   //super is use to invoke imediate parent class constructor
		this.marks=marks;

	}
	void diplay()
	{
		float marks=70.8f;
		super.display();   // to invoke parent display method
		
		System.out.println("child student variable marks: "+this.marks);

	}
}

class child extends Studentdet
{
	long phone;
	public child(int id,String name,String address,float marks,long phone)
	{
		super(id,name,address,marks);
		this.phone=phone;
	}
	
	void display()
	{
		super.display();
			System.out.println("phone number: "+phone);
	}
}

public class MultilevelInheritance {
	public static void main(String []args)
	{
		child obj =new child(1,"nikhil","pune",90.9f,8605306634l);
		obj.display();
		System.out.println("******************************");
		//obj.getData();
		
		
	}

}
