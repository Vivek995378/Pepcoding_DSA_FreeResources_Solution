package basicOfPepcoding;
import java.util.*;

public class GcdAndLcm 
{
	public static void main(String[] args) 
	{
		// write your code here  
	    Scanner sc = new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    int max = a>b?a:b;
	    int gcd = 0;
	    for(int i=1; i<max/2; i++)
	    {
	        if(a%i == 0 && b%i == 0)
	        {
	            gcd=i;
	        }
	    }
	    int rem_a= a/gcd;
	    int rem_b= b/gcd;
	    
	    int lcm = gcd * rem_a * rem_b;
	    System.out.println(gcd);
	    System.out.println(lcm);
	    
	    //Another Approach
	   /* int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int n1_ = n1;
        int n2_ = n2;
        while (n1_ % n2_ != 0) {
            int rem = n1_ % n2_;
            n1_ = n2_;
            n2_ = rem;
        }
        int gcd = n2_;
        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);  */
	    sc.close();
	}
}