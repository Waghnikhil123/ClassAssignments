package corejavaproject;
//find old number between 1 to 50
public class LoopDemo
{
	public static void main(String []args)
	{
		int i;
		for(i=1;i<=50;i++)   //or we use i=i+2 instead of i++ to avoid if statement
		{
			if(i%2==1)
			{
			System.out.println(i);
			}
		}
	}

}
