package functionAndArrayPepcoding;

import java.util.Scanner;

public class SubSetsOfArray 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]= new int[n];
	    for(int i=0; i<n; i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    
	    int limit = (int)Math.pow(2,n);
	    for(int i=0; i<limit; i++)
	    {
			//Convert i to bnary and use 0's and 1's to print
	        int temp=i;
	        String set="";
	        for(int j=n-1; j>=0; j--)
	        {
	            int rem=temp%2;    
	            temp/=2;
	            if(rem==0)
	            {
	                set ="-" + "\t" + set;
	            }
	            else
	            {
	                set =a[j] +"\t"+set;
	            }
	        }
	        System.out.println(set);
	    }
	    sc.close();
	}
}

