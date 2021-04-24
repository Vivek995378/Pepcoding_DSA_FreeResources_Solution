package functionAndArrayPepcoding;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n1 =sc.nextInt();
	    int a[] = new int[n1];
	    for(int i=0; i<n1; i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int n2 =sc.nextInt();
	    int b[] = new int[n2];
	    for(int i=0; i<n2; i++)
	    {
	        b[i]=sc.nextInt();
	    }
	    sc.close();
	    int max = n1>n2?n1:n2;
	    int c[]= new int[max];
	    int i= a.length - 1;
	    int j= b.length - 1;
	    int k= c.length - 1;
	    int carry = 0;
	    while (k >= 0)
	    {
	        int sum = carry;
	            
	        if (i >= 0) 
	        {
	            sum += a[i];
	        }
	            
	        if (j >= 0)
	        {
	            sum += b[j];
	        }
	            
	        carry = sum / 10;
	        sum = sum % 10;
	            
	        c[k] = sum;
	            
	        i--;
	        j--;
	        k--;
	    }
	    if(carry != 0)
	    {
	        System.out.print(carry);
	    }
	    for(i=0; i<max; i++)
	    {
	        System.out.println(c[i]);
	    }
	    

	}

}
