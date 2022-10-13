import java.util.Scanner;

public class Test1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r[]=new int[5]; // declaring an array
		int i;
		
		for(i=0;i<=4;i++)  // storing values in array
		{
			System.out.println( "/n/t enter any value:");
			r[i]=sc.nextInt();
			
		}
		//displaying values in array
		{
			System.out.println( "/n/n/t**** displaying values from my array****");
			for(i=0;i<=4;i++)
			{
				System.out.println(" value is " +r[i]);
				
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
