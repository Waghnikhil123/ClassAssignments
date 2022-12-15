package OopConcept;
class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	String add(String a,String b)
	{
		return a+b;
	}
	
	
}

public class MethodOverloading {
	public static void main(String[] args)
	{
		Calculator cal =new Calculator();
		System.out.println(cal.add(10,45));
		System.out.println(cal.add("nikhil"," wagh"));
	}
}
