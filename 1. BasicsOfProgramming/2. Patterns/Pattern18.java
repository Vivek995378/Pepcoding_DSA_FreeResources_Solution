package basicPatternOfPepcoding;
import java.util.*;

public class Pattern18 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	
	     // write ur code here
	     int n = sc.nextInt();
	     int space = 0;
	     int digit = n;
	     for(int i=1; i<=n; i++)
	     {
	         for(int j=1; j<=space; j++)
	         {
	             System.out.print("\t");
	         }
	         for(int j=1; j<=digit; j++)
	         {
	             if(i>1 && i<=n/2 && j>1 && j<digit)
	             {
	                 System.out.print("\t");
	             }
	             else
	             {
	                System.out.print("*\t");
	             }
	         }
	         
	         if(i <= n/2)
	         {
	             space++;
	             digit-=2;
	         }
	         else
	         {
	             space--;
	             digit+=2;
	         }
	         System.out.println();
	     }
	     sc.close();

 }
}