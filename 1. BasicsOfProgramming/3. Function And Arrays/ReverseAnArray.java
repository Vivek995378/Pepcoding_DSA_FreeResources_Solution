package functionAndArrayPepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseAnArray 
{
	public static void display(int[] a)
	{
	    StringBuilder sb = new StringBuilder();
	    for(int val: a)
	    {
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	}

	public static void reverse(int[] a)
	{
	    // write your code here
	    int x=0;
	    int y=a.length-1;
	    while(x<=y)
	    {
	        int temp = a[x];
	        a[x]=a[y];
	        a[y]=temp;
	        x++;
	        y--;
	    }
	}

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a);
	    display(a);
	}

}


