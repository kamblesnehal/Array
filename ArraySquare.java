import java.util.Scanner;

public class ArraySquare 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r[]=new int[5];
		int i;
		
		for(i=0;i<=4;i++)
		{
			System.out.println("Enter values");
			r[i]=sc.nextInt();
		}
		for (i=0;i<=4;i++)
		{
			System.out.println("square of " +r[i]*r[i]);
		}
	}
	
	

}
