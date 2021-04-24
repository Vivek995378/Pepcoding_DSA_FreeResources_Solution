package RecursionInArrays;

import java.util.Scanner;

public class FirstIndex {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        System.out.println(firstIndex(a,0,d));
        sc.close();
    }

    public static int firstIndex(int[] arr, int idx, int x)
    {
        if(idx==arr.length)
        {
            return -1;
        }
        // int ans = firstIndex(arr,idx+1,x);
        // if(arr[idx]==x)
        // {
        //     return idx;
        // }
        // else 
        // {
        //     return ans;
        // }
    //OR
        
        if(arr[idx]==x)
        {
            return idx;
        }
        else 
        {
            int ans = firstIndex(arr,idx+1,x);
            return ans;
        }
    }

}
