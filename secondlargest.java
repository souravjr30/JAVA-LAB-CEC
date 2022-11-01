import java.util.Scanner;
class secondlargest
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = obj.nextInt();
		
		int arr[] = new int[10];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int large,temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else
				continue;
			}
		}
		System.out.println("The second largest element in the given array is "+arr[arr.length-2]);
	}
}
