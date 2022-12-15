package Arrayexample;

public class JaggedArray {
	public static void main(String[] args) {
		int arr[][]=new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[3];
		arr[2]=new int[4];

		int num=1;    
		//initializing jagged array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=num++;
			}
		}
		
		//printing data of jagged array
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
	}
}
