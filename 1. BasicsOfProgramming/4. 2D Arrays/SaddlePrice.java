package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class SaddlePrice {

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
        sc.close();
        
        for(int i=0; i<n; i++)
        {
            //SVJ = smallestValueOfJ (for getting smallest value along all rows)
            int svj = 0;
            for(int j=1; j<n; j++)
            {
                if(a[i][j] < a[i][svj])
                {
                    svj=j;
                }
            }
            
            boolean flag=true;
            for(int k=0; k<n; k++)
            {
                if(a[k][svj]>a[i][svj])
                {
                    flag=false;
                }
            }
            if(flag)
            {
                System.out.println(a[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
        

	}

}
