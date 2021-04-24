package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksWithTransactionFee {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]= new int[n];
        
        for(int i=0; i<prices.length; i++)
        {
            prices[i]=sc.nextInt();
        }
        
        int fee = sc.nextInt();
        
        int obsp = -prices[0];
        int ossp = 0;
        for(int i=1; i<prices.length; i++)
        {
            int nbsp = 0;
            int nssp = 0;
            if(ossp - prices[i] > obsp)
            {
                nbsp = ossp - prices[i];
            }
            else
            {
                nbsp = obsp;
            }
            
            if(obsp + prices[i] - fee > ossp)
            {
                nssp = obsp + prices[i] - fee;
            }
            else
            {
                nssp = ossp;
            }
            ossp = nssp;
            obsp = nbsp;
            
        }
        System.out.println(ossp);
        sc.close();
    }
}

/*
 * Sample Input
12
10
15
17
20
16
18
22
20
22
20
23
25
3

Sample Output
13
*/
