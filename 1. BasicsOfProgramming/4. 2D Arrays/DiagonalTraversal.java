package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        for(int g=0; g<a.length; g++)
        {
            for(int i=0,j=g; j<a.length; i++,j++)
            {
                System.out.println(a[i][j]);
            }
        }
        sc.close();

	}

}
