import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,fact=1;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		
		System.out.println("The factorial of the number is: "+fact);
		sc.close();
	}
}
