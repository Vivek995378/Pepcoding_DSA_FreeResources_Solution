package basicPatternOfPepcoding;
import java.util.*;

public class Pattern8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n= sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n;j++)
            {
                if(i+j>n)
                {
                    System.out.print("*\t");
                    break;
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}