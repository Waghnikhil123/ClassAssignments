package Arrayexample;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String []args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element of array ");
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("5 elements of array is ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		//for each loop prints array of element one by one
		for(int var: arr)
		{
			System.out.println(var);

		}
	}

}
