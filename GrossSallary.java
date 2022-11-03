package corejavaproject;
import java.util.Scanner;
public class GrossSallary
{
	public static void main(String []args)
	{
		float bs,gs,hra=0,da=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic sallary");
		bs=sc.nextFloat();
		 if(bs<=10000)
		 {
			 hra=(bs*20)/100;
			 da=(bs*80)/100;
			 gs=bs+da+hra;
				System.out.println("gross sallary is "+gs);
		 }
		 else if(bs>=20000)
		 {
			 hra=(bs*25)/100;
			 da=(bs*90)/100;
			 gs=bs+da+hra;
				System.out.println("gross sallary is "+gs);
		 }
		 else if(bs>20000)
		 {
			 hra=(bs*30)/100;
			 da=(bs*95)/100;
			 gs=bs+da+hra;
				System.out.println("gross sallary is "+gs); 
		 }
		
	   
		
				
	}

}
