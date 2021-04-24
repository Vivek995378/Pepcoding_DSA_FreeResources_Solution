package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class Tiling2x1 {
	
	public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int dp[]= new int[n+1];
        dp[1]= 1;   // way to tile up 2 * 1 (2 * n) only vertically
        dp[2]= 2;   // way to tile up 2 * 2 (2 * n) both vertically or horizontally (remember the dimension of tile and floor)
        
        for(int i=3; i<=n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
        sc.close();
    }

}

/*
 * Sample Input
8

Sample Output
34
*/
