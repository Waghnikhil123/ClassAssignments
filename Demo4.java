package OopConcept;

import java.util.Scanner;

class Studentt
{
	int id,n;                       //instance variable
	String name,address,course;   //instance variable
	float fees;                      //instance variable
	
	void setData(int id,String name,String address,String course,float fees )
	{
	  this.id=id;
	  this.name= name;
	  this.address= address;
	  this.course=course;
	  this.fees=fees;
	  
		//System.out.println("this keyword : "+this );
    this.displayData();
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

public class Demo4 {
	public static void main(String []args)
	{
		Studentt nikhil= new Studentt();
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
			
			sc.nextLine();  //it will consume the delimiter(enter)
			
			System.out.println("enter name ");
			name= sc.nextLine();
			System.out.println("enter address ");
			address= sc.nextLine();
			System.out.println("enter course ");
			course= sc.nextLine();
			System.out.println("enter fees ");
			fees= sc.nextFloat();
			
			//Studentt obj =new Studentt();                  //annonymous object creation
			new Studentt().setData(id, name, address, course, fees);
			//System.out.println("obj obect: "+obj);

			System.out.println("=======================================");

			//obj.displayData();
			
			
		}
	}
}
