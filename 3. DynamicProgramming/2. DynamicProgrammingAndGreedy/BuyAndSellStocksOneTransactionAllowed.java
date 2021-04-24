package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksOneTransactionAllowed {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int prices[]=new int[n];
        for(int i=0; i<prices.length; i++)
        {
            prices[i]=sc.nextInt();
        }
        
        int least = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < least)
            {
                least = prices[i];
            }
            
            pist = prices[i] - least;
            if(op < pist)
            {
                op = pist;
            }
        }
        System.out.println(op);
        sc.close();
    }
}

/*
 * Sample Input
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
17
*/
