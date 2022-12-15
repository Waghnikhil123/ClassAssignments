package OopConcept;

class Bank
{
	int rateOfInterest()
	{
		return 8;
	}
}
class Sbi extends Bank
{
	int rateOfInterest()
	{
		return 7;
	}

}
class Axis extends Bank
{
	int rateOfInterest()
	{
		return 5;
	}
}
public class HierarchicalInheritance{
	public static void main(String[] args)
	{
		Sbi sbi =new Sbi();
		System.out.println("rate of interest: "+sbi.rateOfInterest()+" %");
		Axis axis =new Axis();
		System.out.println("rate of interest: "+axis.rateOfInterest()+" %");
	}
	

}
