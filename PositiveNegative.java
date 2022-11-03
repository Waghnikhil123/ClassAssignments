package corejavaproject;
import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args)
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter one number");
		num= sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num+" is positive");

		}
		else
		{
			System.out.println(num+" is negative ");

		}
		
	}

}
