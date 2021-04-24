package TimeAndSpaceComplexity;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
	    //write your code here
	    int alength=a.length;
	    int blength=b.length;
	    int size=alength+blength;
	    int c[]=new int[size];
	    int i=0,j=0,k=0;
	    while(i<alength && j<blength)
	    {
	        if(a[i]<b[j])    
	        {
	            c[k]=a[i];
	            i++;
	            k++;
	        }
	        else
	        {
	            c[k]=b[j];
	            j++;
	            k++;
	        }
	    }
	    while(i<alength)
	    {
	        c[k]=a[i];
	        i++;
	        k++;
	    }
	    while(j<blength)
	    {
	        c[k]=b[j];
	        j++;
	        k++;
	    }
	    
	    return c;
	  }

	  public static void print(int[] arr){
	    for(int i = 0 ; i < arr.length; i++){
	      System.out.println(arr[i]);
	    }
	  }
	  public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0 ; i < n; i++){
	      a[i] = sc.nextInt();
	    }
	    int m = sc.nextInt();
	    int[] b = new int[m];
	    for(int i = 0 ; i < m; i++){
	      b[i] = sc.nextInt();
	    }
	    int[] mergedArray = mergeTwoSortedArrays(a,b);
	    print(mergedArray);
	    sc.close();
	  }

}
