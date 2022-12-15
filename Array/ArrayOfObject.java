package Arrayexample;
import java.util.Scanner;
class Account
{
	int accNo;
	String accholderName;
	double amount;
	public Account(int accNo, String accholderName, double amount) {
		super();
		this.accNo = accNo;
		this.accholderName = accholderName;
		this.amount = amount;
	}
	
	public void Statement()
	{
		System.out.println("account number: "+accNo+ "\n"+"account holder name: "+accholderName+"\n"+"account balance: "+amount);
	}
	
}
public class ArrayOfObject {
	public static void main(String[] args) {
		int accId;
		String holderName;
		double amount;
		Scanner sc=new Scanner(System.in);
		
		Account bank[]=new Account[3];
		
		System.out.println("enter account details: ");
		for(int i=0;i<bank.length;i++)
		{
			System.out.println("enter account no: ");
			accId=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter holder name: ");
			holderName=sc.nextLine();
			
			System.out.println("enter account balance ");
			amount=sc.nextDouble();
			
			bank[i]=new Account(accId,holderName,amount);
		}
		
		//print details
		for(int i=0;i<bank.length;i++)
		{
			bank[i].Statement();
			System.out.println("===============================================");
		}
	}
	

}
