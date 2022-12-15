package Arrayexample;
import java.util.Scanner;
public class array2D {
	public static void main(String []args)
	{
		int arr1[][],arr2[][],arr3[][],i,j,row,col;
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
		System.out.println("enter element in "+row +" x " +col+" matrix two");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		//print element
		System.out.println("elements are: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();

		}
		//print addition of element
		arr3 =new int[row][col];

				System.out.println(" addition of elements are: ");
				for(i=0;i<row;i++)
				{
					for(j=0;j<col;j++)
					{
						arr3[i][j]=(arr1[i][j]+arr2[i][j]) ;
						System.out.print(arr3[i][j]+" ");
					}
					System.out.println();

				}
	}
}
