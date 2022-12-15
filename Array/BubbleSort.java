package Arrayexample;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String []args)
	{
		int arr[]=new int[10],i,j,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 element in array");
		
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if (arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n After sorting in ascending order ,values are ");

		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
	}

}
