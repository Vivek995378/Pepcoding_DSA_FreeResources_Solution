package RecursionInArrays;

import java.util.Scanner;

public class LastIndex {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        System.out.println(lastIndex(a,n-1,d));
        // System.out.println(lastIndex(arr, 0, x));
        sc.close();
    }

    public static int lastIndex(int[] arr, int idx, int x)
    {
        if(idx<0)
        {
            return -1;
        }
        if(arr[idx]==x)
        {
            return idx;
        }
        else
        {
            int ans=lastIndex(arr,idx-1,x);
            return ans;
        }
        //or
        // if (idx == arr.length) {
        //     return -1;
        // }
        
        // int ans = lastIndex(arr, idx + 1, x);
        // if (ans == -1) {
        //     if (arr[idx] == x) {
        //         return idx;
        //     } else {
        //         return -1;
        //     }
        // } else {
        //     return ans;
        // }
        
    }

}
