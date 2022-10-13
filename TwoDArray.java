import java.util.Scanner;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		int i,j;
		int a[][]=new int[3][3];
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print( "\n\t Enter any value ");
				a[i][j]=Sc.nextInt();
			}
		}
		System.out.print("\n\t ***** values from 2D array is ****** \n\n\t");

		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print("  " +a[i][j]);
			}
	       System.out.print("\n\n\t");
		}
	}
}
