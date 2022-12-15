package OopConcept;

public class FinalDemo
{
	final int var;
	final static int num;       //static variable
	static {
		num=23;
	}
	final void display() 
	{
		System.out.println("final method "+var +" "+num);
	}
	public FinalDemo(int var)
	{
		this.var=var;
	}		


	public static void main(String[] args)   
	{
		FinalDemo obj=new FinalDemo(10);       //we can take contructor as a final
		// obj.var=10;                          //we can not change final variable
			obj.display();	
	}
}
	
/*class final2 extends FinalDemo     //we can inherit class
{
	// void display()            //we can not override final method
	{
		
	}
}*/