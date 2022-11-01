import java.util.Scanner;
class largerinmatrix
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of rows or columns in the matrix:");
		int length = obj.nextInt();
		int matrix [][] = new int[length][length];
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.println("Enter the "+i+j+"th element in the matrix");
				matrix[i][j] = obj.nextInt();
			}
		}
		int large = matrix[0][0];
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(matrix[i][j]>large)
				{
					large=matrix[i][j];
				}
			}
		}
		System.out.println("The largest element in the matrix is "+large);
	}
}
