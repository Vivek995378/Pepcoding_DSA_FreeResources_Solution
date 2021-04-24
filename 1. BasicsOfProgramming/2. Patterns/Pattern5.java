package basicPatternOfPepcoding;
import java.util.*;

public class Pattern5 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();
        int mid =(n+1)/2;
        for(int i=1 ; i<=n ;i++)
        {
            if(i <= mid)
            {
                for(int j=1; j<=mid-i; j++)
                {
                    System.out.print("\t");
                }
                for(int j=1; j<=(2*i-1); j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            else
            {
                for(int j=1; j<=i-mid; j++)
                {
                    System.out.print("\t");
                }
                for(int j=1; j<=2*(n-i+1)-1; j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}