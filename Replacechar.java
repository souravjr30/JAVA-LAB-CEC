import java.util.Scanner;
class Replacechar
{
	public static void main(String args[])
	{	
		char char1,char2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("Enter the character to be replaced ");
		char1 = sc.next().charAt(0);
		System.out.println("Enter the new character ");
		char2 = sc.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == char1)
			{
				str = str.replace(char1,char2);
			}
		}
		System.out.println(str);
	}
}
