import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int a,i,c=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = obj.nextInt();
		for(i=2;i<a/2;i++)
		{
			if(a%i == 0)
			c++;
			break;
		}
		if(c==0)
		System.out.println("The number is prime");
		else
		System.out.println("The number is not prime");
	}
}
