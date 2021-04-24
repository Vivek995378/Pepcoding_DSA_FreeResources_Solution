package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksInfiniteTransactionAllowed {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int prices[] = new int[n];
        for(int i=0; i<prices.length; i++)
        {
            prices[i] = sc.nextInt();
        }
        
        int profit = 0;
        int bd = 0;
        int sd = 0;
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] > prices[i - 1])
            {
                sd++;
            }
            else
            {
                profit += prices[sd] - prices[bd];
                bd = sd = i;
            }
        }
        profit += prices[sd] - prices[bd];
        System.out.println(profit);
        sc.close();
    }
}

/*
Sample Input
9
11
6
7
19
4
1
6
18
4

Sample Output
30
*/
