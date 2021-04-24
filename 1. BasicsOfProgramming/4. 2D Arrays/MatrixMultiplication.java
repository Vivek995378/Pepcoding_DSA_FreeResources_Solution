package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int row1=sc.nextInt();
	    int col1=sc.nextInt();
	    int a[][]=new int[row1][col1];
	    for(int i=0; i<row1; i++)
	    {
	        for(int j=0; j<col1; j++)
	        {
	            a[i][j]=sc.nextInt();
	        }
	    }
	    
	    int row2=sc.nextInt();
	    int col2=sc.nextInt();
	    int b[][]=new int[row2][col2];
	    for(int i=0; i<row2; i++)
	    {
	        for(int j=0; j<col2; j++)
	        {
	            b[i][j]=sc.nextInt();
	        }
	    }
	    
	    if(col1==row2)
	    {
	        int c[][]= new int[row1][col2];
	        for(int i=0; i<row1; i++)
	        {
	            for(int j=0; j<col2; j++)
	            {
	                for(int k=0; k<row2; k++)
	                {
	                    c[i][j]+= (a[i][k]*b[k][j]);
	                }
	            }
	        }
	        for(int i=0; i<row1; i++)
	        {
	            for(int j=0; j<col2; j++)
	            {
	                System.out.print(c[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    else
	    {
	        System.out.println("Invalid input");
	    }
	    sc.close();

	}

}
