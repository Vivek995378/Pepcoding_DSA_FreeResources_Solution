package basicPatternOfPepcoding;
import java.util.*;

public class Pattern14 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n= sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n +" * "+i+" = "+(n*i));
            i++;
        }
        sc.close();

    }
}