import java.util.Scanner;
class sumofmatrix
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of elements in rows or columns in the matrix: ");
		int length = obj.nextInt();
		int matrix1[][] = new int[length][length];
		int matrix2[][] = new int[length][length];
		int matrix3[][] = new int[length][length];
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.println("Enter the elements of "+i+j+"of the matrix1");
				matrix1[i][j] = obj.nextInt();
			}
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.println("Enter the elements of "+i+j+"of the matrix2");
				matrix2[i][j] = obj.nextInt();
			}
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("The sum of the matrix1 and matrix2 is ");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.println(matrix3[i][j]);
			}
		}
		
	}
}
		
