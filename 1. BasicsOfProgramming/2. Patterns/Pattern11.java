package basicPatternOfPepcoding;
import java.util.*;

public class Pattern11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();
        int count =1;
        int val =1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=count; j++)
            {
                System.out.print(val++ + "\t");
            }
            count++;
            System.out.println();
        }
        sc.close();
        
    }
}