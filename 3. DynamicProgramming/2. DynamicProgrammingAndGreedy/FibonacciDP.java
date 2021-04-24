package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class FibonacciDP {
	
	public static void main(String[] args) throws Exception 
	 {
	    // write your code here
	    Scanner sc=new Scanner(System.in);
	    int n= sc.nextInt();
	    int fbn= fibonacci(n,new int[n+1]);
	    System.out.println(fbn);
	    sc.close();
	    //OR
	    // int a=0,b=1;
	    // int c=0;
	    // for(int i=0; i<n; i++)
	    // {
	    //     c=a+b;
	    //     a=b;
	    //     b=c;
	        
	    // }
	    // System.out.println(a);
	 }
	 public static int fibonacci(int n,int[] qb)
	 {
	    if(n==0 || n==1)
	    {
	        return n;
	    }
	    if(qb[n]!=0)
	    {
	        return qb[n];
	    }
	    int fbnum1= fibonacci(n-1,qb);
	    int fbnum2= fibonacci(n-2,qb);
	    int fbnum=fbnum1+fbnum2;
	    
	    qb[n]=fbnum;
	    return fbnum;
	 }

}
