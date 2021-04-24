package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class Wakanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    int row=sc.nextInt();
	    int col=sc.nextInt();
	    int a[][]=new int[row][col];
	    for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	            a[i][j]=sc.nextInt();
	        }
	    }
	    for(int j=0; j<col; j++)
	    {
	        if(j%2==0)
	        {
	            for(int i=0; i<row; i++)
	            {
	                System.out.println(a[i][j]);
	            }
	        }
	        else
	        {
	            for(int i=row-1; i>=0; i--)
	            {
	                System.out.println(a[i][j]);
	            }
	        }
	    }
	    sc.close();

	}

}
