package OopConcept;
import java.util.Scanner;
class Student3
{
	int id;
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


public class Demo2 {
	public static void main(String []args)
	{
		Student3 nikhil= new Student3();
		int id;
		String name,address,course;
		float fees;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		id= sc.nextInt();
		
		sc.nextLine();   //it will consume the delimilator(enter)
		
		System.out.println("Enter name");
		name=sc.nextLine();                         // if we use sc.next it access only first word
		System.out.println("Enter address");
		id= sc.nextInt();
		
		
		nikhil.setData(101,"nikhil wagh","Dahigaon","java full stack",1000.0f);
		nikhil.displayData();
		
		System.out.println("=====================================================");
		
		Student3 Atik= new Student3();
		Atik.setData(102,"Atik","Tisgaon","java full stack",1000.0f);
		Atik.displayData();
	}

}
