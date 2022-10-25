import java.util.Scanner;
class smallinarr
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Enter the number of elements in the array: ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<n;i++)
		arr[i] = obj.nextInt();
		int small=arr[0];
		for(i=0;i<n;i++)
		if(arr[i]<small)
		small=arr[i];
		System.out.println("The smallest element in the array is "+small);
	}
}
