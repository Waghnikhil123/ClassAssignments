package corejavaproject;
import java.util.Scanner;
public class GreaterNum{
	public static void main(String[] args)
	{
		int num1,num2,num3,max;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 3 number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
	
		if(num1>num2&&num1>num3)
		{
			max=num1;
	    }
		else if(num2>num1&&num2>num3)
		{
			max= num2;
		}
		else
		{
			max=num3;
		}
		System.out.println("maximum number is "+max);
		
	}
	

}
