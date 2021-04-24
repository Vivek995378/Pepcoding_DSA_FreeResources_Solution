package IntroductionToRecursion;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
        sc.close();
    }

    public static int factorial(int n){
        if(n==1)
        {
            return 1;
        }
        int val=1;
        val = n*factorial(n-1);
        return val;
    }

}
