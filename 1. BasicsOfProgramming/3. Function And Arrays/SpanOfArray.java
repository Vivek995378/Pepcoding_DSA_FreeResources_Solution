package functionAndArrayPepcoding;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]= new int[n];
	    int max=0;
	    int min=0;
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	        if(i==1)
	        {
	            min=arr[i];
	        }
	        
	        if(arr[i]>max)
	        {
	            max=arr[i];
	        }
	        if(arr[i]<min)
	        {
	            min=arr[i];
	        }
	    }
	    System.out.println(max-min);
	    sc.close();

	}

}
