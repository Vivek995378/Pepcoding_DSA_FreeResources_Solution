package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class RingRotate {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int a[][]=new int[n][m];
	        for(int i=0; i<n; i++)
	        {
	            for(int j=0; j<m; j++)
	            {
	                a[i][j]=sc.nextInt();
	            }
	        }
	        int s=sc.nextInt();
	        int r=sc.nextInt();
	        shellRotate(a,s,r);
	        display(a);
	        sc.close();
	    }
	    public static void shellRotate(int a[][], int s, int r)
	    {
			//Extract that shell in 1D array
	        int oneD[]= fillOneDFromShell(a,s);
	        rotate(oneD,r);
	        fillShellFromOneD(a,s,oneD);
	    }
	    
	    public static int[] fillOneDFromShell(int a[][],int s)
	    {
	        int minr= s-1;
	        int minc= s-1;
	        int maxr= a.length-s;
	        int maxc= a[0].length-s;
	        int sz= 2*(maxr-minr+maxc-minc);
	        int oneD[]=new int[sz];
	        int idx=0;
	        //left
	        for(int i=minr,j=minc; i<=maxr ; i++)
	        {
	            oneD[idx]=a[i][j];
	            idx++;
	        }
	        //bottom
	        for(int i=maxr,j=minc+1; j<=maxc ; j++)
	        {
	            oneD[idx]=a[i][j];
	            idx++;
	        }
	        //right
	        for(int i=maxr-1,j=maxc; i>=minr ; i--)
	        {
	            oneD[idx]=a[i][j];
	            idx++;
	        }
	        //top
	        for(int i=minr,j=maxc-1; j>=minc+1 ; j--)
	        {
	            oneD[idx]=a[i][j];
	            idx++;
	        }
	        return oneD;
	    }
	    
	    public static void rotate(int a[],int r)
	    {
	        r= r % a.length;
	        if(r < 0)
	        {
	            r = r + a.length;
	        }
	        
	        reverse(a , 0, a.length - r - 1);
	        reverse(a , a.length - r, a.length-1);
	        reverse(a , 0 ,a.length - 1);
	    }
	    
	    public static void reverse(int a[], int si, int ei)
	    {
	        while(si<=ei)
	        {
	            int temp = a[si];
	            a[si] = a[ei];
	            a[ei] = temp;
	            si++;
	            ei--;
	        }
	    }
	    
	    public static void fillShellFromOneD(int a[][],int s,int oneD[])
	    {
	        int minr= s-1;
	        int minc= s-1;
	        int maxr= a.length-s;
	        int maxc= a[0].length-s;
	        int idx=0;
	        //left
	        for(int i=minr,j=minc; i<=maxr ; i++)
	        {
	            a[i][j]=oneD[idx];
	            idx++;
	        }
	        //bottom
	        for(int i=maxr,j=minc+1; j<=maxc ; j++)
	        {
	            a[i][j]=oneD[idx];
	            idx++;
	        }
	        //right
	        for(int i=maxr-1,j=maxc; i>=minr ; i--)
	        {
	            a[i][j]=oneD[idx];
	            idx++;
	        }
	        //top
	        for(int i=minr,j=maxc-1; j>=minc+1 ; j--)
	        {
	            a[i][j]=oneD[idx];
	            idx++;
	        }
	    }

	    public static void display(int[][] arr)
	    {
	        for(int i = 0; i < arr.length; i++)
	        {
	            for(int j = 0; j < arr[0].length; j++)
	            {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}


