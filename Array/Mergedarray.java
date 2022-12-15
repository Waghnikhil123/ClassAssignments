package Arrayexample;
import java.util.Scanner;

public class Mergedarray {
	public static void main(String []args) {
		
		int first[],second[],third[],size1,size2,i,k;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter size of first array");
		size1= sc.nextInt();
		first=new int[size1];
		
		System.out.println("enter "+size1+ " elements in the first array ");
		for(i=0;i<size1;i++)
		{
			first[i]=sc.nextInt();
		}
		
		System.out.println("enter size of second array ");
		size2=sc.nextInt();
		second=new int[size2];
		
		System.out.println("enter "+size2+ " elements in the second array ");
		for(i=0;i<size2;i++)
		{
			second[i]=sc.nextInt();
		}
		
		third=new int[size1+size2];
		
		for(i=0;i<size1;i++)
		{
			third[i]=first[i];
			
		}
		
		k=i;
		
		for(i=0;i<size2;i++)
		{
			third[k++]=second[i];
		}
		System.out.println("result is after merging");
		for(i=0;i<third.length;i++)
		{
			System.out.println(third[i]+" ");
		}
				
	}

}
