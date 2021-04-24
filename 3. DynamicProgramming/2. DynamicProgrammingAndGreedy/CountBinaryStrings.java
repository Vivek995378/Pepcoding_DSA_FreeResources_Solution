package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class CountBinaryStrings {
	
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int oczeros=1;
	    int ocones=1;
	    
	    for(int i=2; i<=n; i++)
	    {
	        int nczeros = ocones;
	        int ncones = ocones+oczeros;
	        
	        oczeros = nczeros;
	        ocones = ncones;
	    }
	    System.out.println(oczeros+ocones);
	    sc.close();
	 }

}

/*
Sample Input
6

Sample Output
21
*/