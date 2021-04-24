package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksTwoTransactionsAllowed {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int prices[]= new int[n];
        for(int i=0; i<prices.length; i++)
        {
            prices[i]= sc.nextInt();
        }
        
        int leastsf = prices[0];
        int mpist = 0;
        int dpl[] = new int[n];
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] < leastsf)
            {
                leastsf = prices[i];
            }
            mpist = prices[i] - leastsf;
            if(mpist > dpl[i - 1])
            {
                dpl[i] = mpist;
            }
            else
            {
                dpl[i] = dpl[i - 1];
            }
        }
        
        int maxptt = prices[prices.length - 1];
        int mpibt = 0;
        int dpr[] = new int[n];
        for(int i=prices.length - 2; i>=0; i--)
        {
            if(prices[i] > maxptt)
            {
                maxptt = prices[i];
            }
            mpibt = maxptt - prices[i];
            if(mpibt > dpr[i + 1])
            {
                dpr[i] = mpibt;
            }
            else
            {
                dpr[i] = dpr[i + 1];
            }
        }
        
        int op = 0;
        for(int i=0; i<dpl.length; i++)
        {
            if(dpl[i] + dpr[i] > op)
            {
                op = dpl[i] +dpr[i];
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
30
*/
