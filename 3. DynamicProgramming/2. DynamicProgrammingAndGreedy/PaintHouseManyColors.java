package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class PaintHouseManyColors {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        int arr[][] = new int[n][c];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int dp[][] = new int[n][c];
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        
        for(int j=0; j<dp[0].length; j++)
        {
            dp[0][j] = arr[0][j];
            if(dp[0][j] <= least)
            {
                sleast = least;
                least = dp[0][j];
            }
            else if(dp[0][j] <= sleast)
            {
                sleast = dp[0][j];
            }
        }
        
        for(int i=1; i<dp.length; i++)
        {
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            
            for(int j=0; j<dp[0].length; j++)
            {
                if(dp[i-1][j] == least)
                {
                    dp[i][j] = arr[i][j] + sleast;
                }
                else
                {
                    dp[i][j] = arr[i][j] + least;
                }
                
                
                if(dp[i][j] <= nleast)
                {
                    nsleast = nleast;
                    nleast = dp[i][j];
                }
                else if(dp[i][j] <= nsleast)
                {
                    nsleast = dp[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }
        System.out.println(least);
        sc.close();
    }
}
/*
 * Sample Input
4 3
1 5 7
5 8 4
3 2 9
1 2 4

Sample Output
8
*/
