package IntroductionToRecursion;

import java.util.Scanner;

public class PowerLogarithmic {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pow=power(x,n);
        System.out.println(pow);
        sc.close();
    }

    public static int power(int x, int n)
    {
        int ans=1;
        if(n==0)
        {
            return 1;
        }
        if(n%2==0)    
        {
            ans = power(x,n/2)*power(x,n/2);
        }
        else
        {
            ans = x*power(x,n-1);
        }
    //OR
        // ans=power(x,n/2)*power(x,n/2);
        // if(n%2==1)
        // {
        //     ans = ans*x;
        // }
        return ans;
    }
	
}
