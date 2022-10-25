import java.util.Scanner;
class add2num
{
	public static void main(String args[])
	{
		int a,b,sum;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		a = obj.nextInt();
		b = obj.nextInt();
		sum = a+b;
		System.out.println("Sum is "+sum);
	}
}
