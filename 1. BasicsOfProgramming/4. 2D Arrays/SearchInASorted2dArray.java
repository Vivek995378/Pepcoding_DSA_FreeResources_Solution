package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class SearchInASorted2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int search=sc.nextInt();
        sc.close();
        
        int i=0; 
        int j=a[0].length-1;
        while(i<a.length && j>=0)
        {
            if(a[i][j]==search)
            {
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(a[i][j]<search)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        System.out.println("Not Found");
        

	}

}
