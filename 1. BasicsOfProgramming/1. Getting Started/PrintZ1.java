package basicOfPepcoding;

import java.util.Scanner;

public class PrintZ1 {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int space = n-2;
		for(int i=1; i<=n; i++)
		{
			if(i ==1 || i ==n)
			{
				for(int j=1; j<=n; j++)
				{
					System.out.print("*\t");
				}
			}
			else
			{
				for(int j=1; j<=space; j++)
				{
					System.out.print("\t");
				}
				System.out.print("*\t");
				space--;
			}
			
			System.out.println();
		}
		sc.close();
	}
}
