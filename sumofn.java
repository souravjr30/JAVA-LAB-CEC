import java.util.Scanner;
class sumofn
{
	public static void main(String args[])
	{
		int n,i,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = obj.nextInt();
		for(i=1;i<=n;i++)
		sum=sum+i;
		System.out.println("Sum of first n natural numbers is "+sum);
	}
}
		
