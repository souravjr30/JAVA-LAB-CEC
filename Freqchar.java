import java.util.Scanner;
class Freqchar
{
	public static void main(String args[])
	{	
		char char1,char2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("Enter the character to count the frequency ");
		char1 = sc.next().charAt(0);
		int f=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == char1)
			{
				f++;
			}
		}
		System.out.println("Frequency of "+char1+" in "+str+" is "+f );
	}
}
