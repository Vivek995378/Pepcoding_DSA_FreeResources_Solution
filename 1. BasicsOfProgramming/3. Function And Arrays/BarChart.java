package functionAndArrayPepcoding;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int max=0;
	    int a[] = new int[n];
	    for(int i=0; i<n; i++)
	    {
	        a[i]=sc.nextInt();
	        if(a[i]>max)
	        {
	            max=a[i];
	        }
	    }
	    for(int floor=max; floor>=1; floor--)
	    {
	        for(int i=0; i<n; i++)
	        {
	            if(a[i]>=floor)
	            {
	                System.out.print("*\t");
	            }
	            else
	            {
	                System.out.print("\t");
	            }
	        }
	        System.out.println();
	    }
	    sc.close();

	}

}
