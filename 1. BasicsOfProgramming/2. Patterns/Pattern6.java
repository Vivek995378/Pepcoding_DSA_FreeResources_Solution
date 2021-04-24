package basicPatternOfPepcoding;
import java.util.*;

public class Pattern6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n= sc.nextInt();
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++)
        {
            if(i <= mid)
            {
                for(int j=1; j<=mid-i+1; j++)
                {
                    System.out.print("*\t");
                }
                for(int j=1; j<=i; j++)
                {
                    System.out.print("\t");
                }
                for(int j=2; j<=i; j++)
                {
                    System.out.print("\t");
                }
                for(int j=1; j<=mid-i+1; j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            else
            {
                for(int j=1; j<=i-mid+1; j++)
                {
                    System.out.print("*\t");
                }
                for(int j=1; j<=n-i+1; j++)
                {
                    System.out.print("\t");
                }
                for(int j=2; j<=n-i+1; j++)
                {
                    System.out.print("\t");
                }
                for(int j=1; j<=i-mid+1; j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}