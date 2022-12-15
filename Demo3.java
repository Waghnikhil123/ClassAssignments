package OopConcept;

import java.util.Scanner;

class Student2
{
	int id,n;
	String name,address,course;
	float fees;
	
	void setData(int i,String n,String a,String c,float f )
	{
	  id=i;
	  name= n;
	  address= a;
	  course=c;
	  fees=f;
	}
	
	void displayData()
	{
		System.out.println("id : "+id );
		System.out.println("name : "+name );
		System.out.println("address : "+address );
		System.out.println("course : "+course );
		System.out.println("fees : "+fees);

		
	}
}


public class Demo3 {
	public static void main(String []args)
	{
		Student2 nikhil= new Student2();
		int id,num;
		String name,address,course;
		float fees;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student you want to enter: ");
		num= sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println("enter id ");
			id= sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("enter name ");
			name= sc.nextLine();
			System.out.println("enter address ");
			address= sc.nextLine();
			System.out.println("enter course ");
			course= sc.nextLine();
			System.out.println("enter fees ");
			fees= sc.nextFloat();
			
			Student2 obj =new Student2();
			obj.setData(id, name, address, course, fees);
			System.out.println("=======================================");

			obj.displayData();
			
			
		}
	}

}
