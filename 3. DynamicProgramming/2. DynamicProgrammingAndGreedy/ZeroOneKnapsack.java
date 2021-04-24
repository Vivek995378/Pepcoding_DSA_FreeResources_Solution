package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class ZeroOneKnapsack {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val[]=new int[n];
        for(int i=0; i<n; i++)
        {
            val[i]=sc.nextInt();
        }
        int wt[]=new int[n];
        for(int i=0; i<n; i++)
        {
            wt[i]=sc.nextInt();
        }
        int cap=sc.nextInt();
        
        int dp[][]=new int[n+1][cap+1];
        for(int i=1; i<dp.length; i++)
        {
            for(int j=1; j<dp[0].length; j++)
            {
                if(j >= wt[i-1])
                {
                    if(dp[i-1][j-wt[i-1]] + val[i-1] > dp[i-1][j])
                    {
                        dp[i][j]=dp[i-1][j-wt[i-1]] + val[i-1];
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
        sc.close();
    }

}

/*Sample Input
5
15 14 10 45 30
2 5 1 3 4
7

Sample Output
75
*/