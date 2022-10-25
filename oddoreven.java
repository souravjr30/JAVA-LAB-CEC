import java.util.Scanner;
class oddoreven
{
	public static void main(String args[])
	{
		int a;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = obj.nextInt();
		if (a%2 == 0)
		System.out.println("The number is even");
		else
		System.out.println("The number is odd");
	}
}
