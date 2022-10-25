import java.util.Scanner;
class sumofarray
{
	public static void main(String args[])
	{
		int i,sum=0;
		System.out.println("Enter the number of elements in the array: ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<n;i++)
		arr[i] = obj.nextInt();
		for(i=0;i<n;i++)
		sum=sum+arr[i];
		System.out.println("The sum of elements in the array is "+sum);
	}
}
