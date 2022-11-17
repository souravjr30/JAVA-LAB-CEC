import java.util.Scanner;
class Stringsearch
{
	public static void main(String args[])
	{
		char k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("Enter the character to be searched ");
		k = sc.next().charAt(0);
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == k)
			{
				System.out.println("The character found in string at the position "+(i+1));
				flag=1;
				break;
			}
		}
		if(flag!=1)
		System.out.println("The character is not found in the given string ");
		
	}
}
			
		
