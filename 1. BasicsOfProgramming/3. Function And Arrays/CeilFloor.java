package functionAndArrayPepcoding;

import java.util.Scanner;

public class CeilFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int x=sc.nextInt();
	    int low=0;
	    int high=n-1;
	    int ceil=0;
	    int floor=0;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        if(x>a[mid])
	        {
	            low=mid+1;
	            floor=a[mid];
	        }
	        else if(x<a[mid])
	        {
	            high=mid-1;
	            ceil=a[mid];
	        }
	        else
	        {
	            
	            ceil=a[mid];
	            floor=a[mid];
	            break;
	        }
	    }
	    System.out.println(ceil);
	    System.out.println(floor);
	    sc.close();
	}

}
