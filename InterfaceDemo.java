package OopConcept;
interface Myinterface
{
	public void method();
	int x=10;
	default void fun()
	{
		System.out.println("we can add method body in interface using default");
	}
	static int cube(int x)
	{
		return x*x*x;
	}
}
interface Drawable extends Myinterface     //
{
	public void draw();
	//public void method();

}
class test
{
	int id;
	test()
	{
		this.id=id;
	}
}
class demoo extends test implements Drawable    //by interface we implements multiple inheritance
{
	
	@Override
	public void method()
	{
		System.out.println("overridden method of interface ");
	}
	public void draw()
	{
		System.out.println("drawing a circle");

	}
}
public class InterfaceDemo {
	public static void main(String []args)
	{
		demoo obj=new demoo();    //also by using upcasting we can write //drawable obj=new demo();
		                          //we can not creat object of interface thats why we ca
		obj.method();            
		System.out.println(Myinterface.cube(5));

		obj.fun();
	}

}
