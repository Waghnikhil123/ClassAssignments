package Arrayexample;

import java.util.Scanner;

public class AddOfDiagonal {
	public static void main(String []args)
	{
		int arr1[][],i,j,row,col,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row ");
		row= sc.nextInt();
		System.out.println("enter column");
		col =sc.nextInt();
		
		arr1 =new int[row][col];
		
		System.out.println("enter element in "+row +" x " +col+" matrix one");
		 
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		//print element
				System.out.println("elements are: ");
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						if(i==j)
						{
							sum=sum+arr1[i][j];
						}
						System.out.print(arr1[i][j]+" ");

					}
					System.out.println();

				}
				System.out.println("sum of diagonal is "+sum);
	}
}
