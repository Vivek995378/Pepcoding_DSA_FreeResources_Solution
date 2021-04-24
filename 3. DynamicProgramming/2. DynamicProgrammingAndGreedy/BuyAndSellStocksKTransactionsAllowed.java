package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksKTransactionsAllowed {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int k =sc.nextInt();
        
        int dp[][]= new int[k+1][n];
        
        for(int t=1; t<dp.length; t++)
        {
            int max = Integer.MIN_VALUE;
            
            for(int d=1; d<dp[0].length; d++)
            {
                if(dp[t-1][d-1] - arr[d-1] > max)
                {
                    max = dp[t-1][d-1] - arr[d-1];
                }
                
                if(max + arr[d] > dp[t][d-1])
                {
                    dp[t][d] = max + arr[d];
                }
                else
                {
                    dp[t][d] = dp[t][d-1];
                }
                
            }
        }
        System.out.println(dp[k][n-1]);
        sc.close();
    }
}

/*
 * Sample Input
6
9
6
7
6
3
8
1

Sample Output
5
*/
