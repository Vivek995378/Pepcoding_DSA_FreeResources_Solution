package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class BuyAndSellStocksWithCooldown {
	
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if (ocsp - arr[i] > obsp) {
                nbsp = ocsp - arr[i];
            } else {
                nbsp = obsp;
            }

            if (arr[i] + obsp > ossp) {
                nssp = arr[i] + obsp;
            } else {
                nssp = ossp;
            }

            if (ossp > ocsp) {
                ncsp = ossp;
            } else {
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
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

Sample Output
19
*/
