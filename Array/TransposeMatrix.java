package Arrayexample;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String []args)
	{
		int arr1[][],arr2[][],i,j,row,col;
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
						System.out.print(arr1[i][j]+ " ");
					}
					System.out.println();

				}
		arr2 =new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr2[i][j]=arr1[j][i];
			}
		}
		System.out.println("transpose of matrix ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();

		}
		
}
}
