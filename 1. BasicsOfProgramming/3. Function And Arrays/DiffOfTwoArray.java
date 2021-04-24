package functionAndArrayPepcoding;

import java.util.Scanner;

public class DiffOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int a1[]= new int[n1];
	    for(int i=0; i<n1; i++)
	    {
	        a1[i]= sc.nextInt();
	    }
	    
	    int n2 = sc.nextInt();
	    int a2[]= new int[n2];
	    for(int i=0; i<n2; i++)
	    {
	        a2[i]= sc.nextInt();
	    }
	    
	    int diff[]= new int[n2];
	    int i = a1.length-1;
	    int j = a2.length-1;
	    int k = diff.length-1;
	    int carry =0;
	    
	    while(k>=0)
	    {
	        int d = 0;
	        int a1Value = i>=0?a1[i]:0;
	        if(a2[j] + carry >= a1Value)
	        {
	            d = a2[j] + carry -a1Value;
	            carry =0;
	        }
	        else
	        {
	            d = a2[j] + carry +10 -a1Value;
	            carry =-1;
	        }
	        
	        diff[k] = d;
	        
	        i--;
	        j--;
	        k--;
	    }
	    int index =0;
	    while(index <= diff.length)
	    {
	        if(diff[index]==0)
	        {
	            index++;
	        }
	        else
	        {
	            break;
	        }
	    }
	    while(index < diff.length)
	    {
	        System.out.println(diff[index]);
	        index++;
	    }
	    sc.close();

	}

}
