package StringStringBuilderAndArrayList;

import java.util.Scanner;

public class PrintAllPermutationOfAString {
	
	public static void solution(String str){
		// write your code here
		int n=str.length();
		int f=factorial(n);
		
		for(int i=0; i<f; i++)
		{
		    int temp=i;
		    StringBuilder sb=new StringBuilder(str);
		    for(int j=n; j>0; j--)
		    {
		        int q= temp/j;
		        int r= temp%j;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		}
		
	}
	public static int factorial(int n)
	{
	    int val=1;
	    for(int i=2; i<=n; i++)
	    {
	        val *=i;
	    }
	    return val;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);
		sc.close();
	}

}
