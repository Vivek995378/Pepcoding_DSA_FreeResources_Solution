package RecursionInArrays;

import java.util.Scanner;

public class MaxOfAnArray {
	
	public static void main(String[] args) throws Exception 
    {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(a,0));
        sc.close();
    }

    public static int maxOfArray(int[] arr, int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int max= maxOfArray(arr,idx+1);
        if(arr[idx]>max)
        {
            return arr[idx];
        }
        else
        {
            return max;
        }
      
    }

}
