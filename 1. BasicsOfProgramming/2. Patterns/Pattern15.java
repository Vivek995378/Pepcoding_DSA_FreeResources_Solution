package basicPatternOfPepcoding;
import java.util.*;

public class Pattern15
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n =sc.nextInt();
        int space=n/2;
        int digitPerLine=1;
        int val =1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print("\t");
            }
            int val2 = val;
            for(int j=1; j<=digitPerLine; j++)
            {
                System.out.print(val2+"\t");
                if(j <= digitPerLine/2)
                {
                    val2++;
                }
                else
                {
                    val2--;
                }
            }
            System.out.println();
            
            if(i <= n/2)
            {
                digitPerLine+=2;
                space--;
                val++;
            }
            else
            {
                digitPerLine-=2;
                space++;
                val--;
            }
        }
        sc.close();

    }
}