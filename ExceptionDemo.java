package OopConcept;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a,b;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter first number"); a=sc.nextInt();

		System.out.println("enter second number"); b=sc.nextInt();

		try {

		int c=a/b; //ArithmaticException object will throw

		System.out.println(c);

		}

		catch (ArithmeticException ae)
		{ 
			//System.out.println("devide by zero not possible"); 
			//System.out.println("Exception occured: "+ae); 
			//System.out.println("Exception occured: "+ae.getMessage()); 
            ae.printStackTrace();


		} 
		System.out.println("rest line of code!!");
*/
		
		
		/*
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println("string is null");
		}
		System.out.println("rest line of code");
		*/
		
	/*	try {
			String s="abc";
					int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("String can't be converved into int");
		}
		*/
		
		int arr[]=new int[5];
		try {
		arr[7]=34;
		System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException a){
			
			System.out.println("array index is out of bound");
		}
		System.out.println("rest line of code");

		
		}
	

}
