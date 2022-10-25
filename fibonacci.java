import java.util.Scanner;
class fibonacci
{  
	public static void main(String args[])  
    	{    
     		int n1=0,n2=1,n3,i,a;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		a = obj.nextInt();    
     		System.out.print(n1+" "+n2);   
        
     		for(i=2;i<a;++i)    
     		{    
      			n3=n1+n2;    
      			System.out.println(" "+n3);    
      			n1=n2;    
      			n2=n3;    
     		}    
      
    }
}  
