package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class UnboundedKnapsack {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
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
        int dp[]=new int[cap+1];
        dp[0]=0;
        
        for(int bagc=1; bagc<=cap; bagc++)
        {
            int max=0;
            for(int i=0; i<n; i++)
            {
                if(bagc >= wt[i])
                {
                    int rbagc= bagc-wt[i];
                    int rbagcv= dp[rbagc];
                    int total= rbagcv + val[i];
                    if(total>max)
                    {
                        max=total;
                    }
                }
            }
            dp[bagc]=max;
        }
        System.out.println(dp[cap]);
        sc.close();
    }

}

/*
 * Sample Input
5
15 14 10 45 30
2 5 1 3 4
7

Sample Output
100
*/
