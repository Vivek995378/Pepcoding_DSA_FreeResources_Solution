package IntroductionToRecursion;

import java.util.Scanner;

public class PowerLinear {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pow=power(x,n);
        System.out.println(pow);
        sc.close();
    }

    public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }
        int ans= x*power(x,n-1);
        return ans;
    }
	
}
