import java.util.*;
class MatrixTranspose
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter the number of rows:");
		m=sc.nextInt();
		System.out.println("Enter the number of columns:");
		n=sc.nextInt();
		int a[][]=new int[m][n],t[][]=new int[n][m];
		
		System.out.println("Enter the matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The matrix is:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				t[i][j]=a[j][i];
			}
		}
		
		System.out.println("The transpose matrix is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
		
