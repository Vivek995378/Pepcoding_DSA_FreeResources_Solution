package basicOfPepcoding;
import java.util.*;

public class PrintFibbonacciNumberTillN {

	public static void main(String[] args) 
	{
    // write your code here
    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = 0;
	    int b = 1;
	    System.out.println(a);
	    System.out.println(b);
	    for(int i = 2; i < n; i++ )
	    {
	        int c = a +b;
	        System.out.println(c);
	        a = b;
	        b = c;
	    }
//	      int n= sc.nextInt();
//	      int a=0; 
//	      int b=1;
//	      for(int i=1; i<=n; i++)
//	      {
//	          System.out.println(a);
//	          int c =a+b;
//	          a=b;
//	          b=c;
//	      }
	    sc.close();
  }
}