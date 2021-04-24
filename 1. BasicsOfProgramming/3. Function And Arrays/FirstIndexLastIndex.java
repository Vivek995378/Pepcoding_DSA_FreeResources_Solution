package functionAndArrayPepcoding;

import java.util.Scanner;

public class FirstIndexLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int data =sc.nextInt();
	    int low=0;
	    int high=n-1;
	    int fi=-1;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        if(data < a[mid])
	        {
	            high=mid-1;   
	        }
	        else if(data > a[mid])
	        {
	            low=mid+1;
	        }
	        else
	        {
	            fi=mid;
	            high=mid-1;
	        }
	    }
	    System.out.println(fi);
	    
	    low=0;
	    high=n-1;
	    int ei=-1;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        if(data < a[mid])
	        {
	            high=mid-1;   
	        }
	        else if(data > a[mid])
	        {
	            low=mid+1;
	        }
	        else
	        {
	            ei=mid;
	            low=mid+1;
	        }
	    }
	    System.out.println(ei);
	    sc.close();

	}

}
