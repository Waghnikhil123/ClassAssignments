package OopConcept;
class Employee
{
	int id;
	String name, designation;
	double basicsalary;
	static String organization= "Anudip";            //static variable =it makes your program memory efficient
	
	public Employee(int id, String name,String designation,double basicsalary)    //constructor
	{
		this.id=id;
		this.name=name;
		this.designation= designation;
		this.basicsalary =basicsalary;
		
	}
	public void display1()
	{
		System.out.println("\nid: "+id+ "\nName: "+name+"\nDesignation: "+designation+" \nBasic salary: "+basicsalary+"\norganiation: "+organization);
	}
	
	static void ChangeOrganization()
	{
		organization="technoOrbit";
	}
}

public class ConstructorDemo {
	public static void main(String []args)
	{
		Employee emp1 =new Employee(101,"nikhil","Engineer",25000);    //constructor call
		Employee emp2 =new Employee(102,"atik","Engineer",25000);    //constructor call
        emp1.display1();
        
        Employee.ChangeOrganization();     // call/invoke satic method of changeOrganization 
        emp2.display1();

		
	}

}

