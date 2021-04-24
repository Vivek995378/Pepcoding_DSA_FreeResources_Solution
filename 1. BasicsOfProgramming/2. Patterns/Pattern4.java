package basicPatternOfPepcoding;
import java.util.*;

public class Pattern4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n= sc.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();
    }
}