package DynamicProgrammingAndGreedy;

import java.util.Scanner;

public class MaximumSumNonAdjacentElements {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int oldInc= arr[0];
        int oldExc= 0;
        for(int i=1; i<n; i++)
        {
            int newInc = oldExc + arr[i];
            int newExc = Math.max(oldInc, oldExc);
            
            oldInc = newInc;
            oldExc = newExc;
        }
        int max = Math.max(oldInc,oldExc);
        System.out.println(max);
        sc.close();
    }

}

/*
 * Sample Input
6
5
10
10
100
5
6

Sample Output
116
*/
