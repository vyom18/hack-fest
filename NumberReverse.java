import java.util.*;
class NumberReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,r,s=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		while(num>0)
		{
			r=num%10;
			s=s*10+r;
			num=num/10;
		}
		
		System.out.println("The reversed number is: "+s);
		sc.close();
	}
}
