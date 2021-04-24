package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class PaintFence {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int k= sc.nextInt();
        
        long same = k * 1;
        long diff = k * (k - 1);
        long total = same + diff;
        
        for(int i=3; i<=n; i++)
        {
            same = diff * 1;
            diff = total * (k - 1);
            total = same + diff;
        }
        System.out.println(total);
        sc.close();
    }
}

/*
 * Sample Input
8
3

Sample Output
3672
*/
