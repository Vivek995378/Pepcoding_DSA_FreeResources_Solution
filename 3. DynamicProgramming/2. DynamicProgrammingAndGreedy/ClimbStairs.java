package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class ClimbStairs {
	
	public static void main(String[] args) throws Exception     {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //int count= climbStairsUsingRecursion(n,new int[n+1]);		//Memoization
        int count1= climbStairsUsingIteration(n);	//Tabulation
        System.out.println(count1);
        sc.close();
    }
    
    public static int climbStairsUsingRecursion(int n,int[] qb)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        
        if(qb[n]>0)
        {
            return qb[n];
        }
        int nm1= climbStairsUsingRecursion(n-1,qb);
        int nm2= climbStairsUsingRecursion(n-2,qb);
        int nm3= climbStairsUsingRecursion(n-3,qb);
        int total= nm1+nm2+nm3;
        qb[n]=total;
        return total;
    }
    //OR
    public static int climbStairsUsingIteration(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1; i<=n; i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1];
            }
            else if(i==2)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
            else
            {
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }

}
