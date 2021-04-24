package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class Goldmine {
	
	public static void main(String[] args) throws Exception     {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans= maxGold(arr,n,m);
        System.out.println(ans);
        sc.close();
    }
    public static int maxGold(int arr[][],int n,int m)
    {
        int dp[][]=new int[n][m];
        for(int j=m-1; j>=0; j--)
        {
            for(int i=0; i<=n-1; i++)
            {
                if(j==m-1)    
                {
                    dp[i][j]=arr[i][j];
                }
                else if(i==0 && j!=m-1)
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1]) + arr[i][j];
                }
                else if(i==n-1 && j!=m-1)
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1]) + arr[i][j];
                }
                else
                {
                    dp[i][j]=maximum(dp[i][j+1],dp[i+1][j+1],dp[i-1][j+1]) + arr[i][j];
                }
            }
        }int max=Integer.MIN_VALUE;
        for(int i=0,j=0; i<n; i++)
        {
            max=Math.max(max,dp[i][j]);
        }
        return max;
    }
    public static int maximum(int a,int b,int c)
    {
        return a>b&&a>c?a:b>c?b:c;
    }

}
