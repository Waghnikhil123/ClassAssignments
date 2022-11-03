/*
 * write a program to calculate simple interest
 */
package corejavaproject;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args)
	{
		float principle,time,rate,si;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter principle amount");
		principle =sc.nextFloat();
		
		System.out.println("Enter time");
		time=sc.nextFloat();
		
		System.out.println("Enter rate");
		rate =sc.nextFloat();
		
		si=(principle*time*rate)/100;
		System.out.println("simple interest is : "+si);
	}

}
//single line comment
/*multi line comment*/