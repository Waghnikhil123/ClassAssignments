package corejavaproject;
import java.util.Scanner;
public class SumationInLoop 
{
	public static void main(String []args)
	{
		int i,n,sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Range");
		
        n=sc.nextInt();	
        for(i=0;i<=n;i++)
        {
        	sum=sum+i;
        }
        System.out.println("sum of natural number from 0 to "+n+ " is "+sum);
        sc.close();  // use for protection from hack43
	}

}
