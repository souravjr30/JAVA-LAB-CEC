import java.util.Scanner;
class replacearr
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
		System.out.println("Enter the element to be replaced ");
		int a = obj.nextInt();
		System.out.println("Enter thr new element");
		int b = obj.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==a)
			arr[i]=b;
		}
		System.out.println("The new array is ");
		for(i=0;i<n;i++)
		System.out.println(arr[i]);
	}
}
			
			

