package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class SpiralDisplay {

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
        
        int minr=0;
        int minc=0; 
        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int element=row*col;
        int count =0 ;
        while(count<element)
        {
            //left
            for(int i=minr,j=minc; i<=maxr && count<element; i++)
            {
                System.out.println(a[i][j]);
                count++;
            }
            minc++;
            //bottom
            for(int i=maxr,j=minc; j<=maxc && count<element; j++)
            {
                System.out.println(a[i][j]);
                count++;
            }
            maxr--;
            //right
            for(int i=maxr,j=maxc; i>=minr && count<element; i--)
            {
                System.out.println(a[i][j]);
                count++;
            }
            maxc--;
            //top
            for(int i=minr,j=maxc; j>=minc && count<element; j--)
            {
                System.out.println(a[i][j]);
                count++;
            }
            minr++;
        }
        sc.close();

	}

}
