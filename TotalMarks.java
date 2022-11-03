package corejavaproject;
import java.util.Scanner;

public class TotalMarks {

		public static void main(String[] args)
		{
			float m1,m2,m3,tom,dom,total,avg,percentage;
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter m1 mark");
			m1 =sc.nextFloat();
			
			System.out.println("enter m2 mark");
			m2=sc.nextFloat();
			
			System.out.println("enter m3 mark");
			m3 =sc.nextFloat();
			
			System.out.println("enter tom mark");
			tom =sc.nextFloat();
			
			System.out.println("enter dom mark");
			dom =sc.nextFloat();
			
			total=m1+m2+m3+tom+dom;
			System.out.println("total marks is : "+total);
			
			avg= total/5;
			System.out.println("average of marks is : "+avg);
			
			percentage=(total/500)*100;
			System.out.println("percentage of marks is : "+percentage+"%");
			
			if(percentage>90)
			{
				System.out.println("grade A+");
			}
			else if(percentage>80)
			{
				System.out.println("grade A");
			}
			else if(percentage>60)
			{
				System.out.println("grade B");
			}
			else if(percentage>40)
			{
				System.out.println("grade C");
			}
			else if(percentage<40)
			{
				System.out.println("grade D");
			}
			
			 if(total>250)
			{
				System.out.println("you are pass");
			}

		}

	

}
