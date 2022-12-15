package OopConcept;
class Student
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


public class Demo {
	public static void main(String []args)
	{
		Student nikhil= new Student();
		nikhil.setData(101,"nikhil wagh","Dahigaon","java full stack",1000.0f);
		nikhil.displayData();
		
		System.out.println("=====================================================");
		Student Atik= new Student();
		Atik.setData(102,"Atik","Tisgaon","java full stack",1000.0f);
		Atik.displayData();
	}

}
