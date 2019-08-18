import java.util.*;
import java.lang.*;
import java.io.*;

class GS
{
	public static void main(String args[])
	{
		int i,j,p;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter a["+i+"] : ");
			a[i]=in.nextInt();
		}
		System.out.print("Array: ");
		for(i=0;i<=n-1;i++)
			System.out.print(a[i]+" ");
		for(i=0;i<=n-1;i++)
		{
			p=1;
			for(j=0;j<=n-1;j++)
			{
				if(i!=j)
					p=p*a[j];
			}
			b[i]=p;
		}
		System.out.print("\nSpecial Array: ");
		for(i=0;i<=n-1;i++)
			System.out.print(b[i]+" ");
	}
}