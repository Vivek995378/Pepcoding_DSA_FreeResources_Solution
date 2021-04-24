package basicPatternOfPepcoding;
import java.util.*;

public class Pattern17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n= sc.nextInt();
        int space= n/2;
        int digit= 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                if(i == n/2+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            for(int j=1; j<=digit; j++)
            {
                System.out.print("*\t");
            }
            if(i <= n/2)
            {
                digit++;
            }
            else
            {
                digit--;
            }
            System.out.println();
        }sc.close();

    }
}




