import java.util.Scanner;

class Transposematrix
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the length of row and column of the array ");
		int length= obj.nextInt();
		int matrix[][]=new int[length][length];
		for (int i=0;i<length;i++)
		{
			for (int j=0;j<length;j++)
			{
				System.out.println("enter the "+i+j+"th element");
				matrix[i][j]=obj.nextInt();
			}
		 }
		 
		int transpose[][]=new int[length][length]; 
		for (int i=0;i<length;i++)
		{
			for (int j=0;j<length;j++)
			{
				transpose[i][j]=matrix[j][i]; 
			}
		}
		for (int i=0;i<length;i++)
		{
			for (int j=0;j<length;j++)
			{
				System.out.println(transpose[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}
    

