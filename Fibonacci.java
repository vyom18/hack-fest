import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,c,i;
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		
		System.out.println("The fibonacci series upto "+n+" elements is:");
		for(i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		sc.close();
	}
}
