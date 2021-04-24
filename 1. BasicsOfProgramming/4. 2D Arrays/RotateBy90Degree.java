package TwoDArrayOfPepcoding;

import java.util.Scanner;

public class RotateBy90Degree {

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
        
//        for(int j=0; j<n; j++)
//        {
//            for(int i=n-1; i>=0; i--)
//            {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
        //OR
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = a[i][j];
            }
        }

        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < n; i++) {
                int temp = ans[i][j];
                ans[i][j] = ans[i][n - j - 1];
                ans[i][n - j - 1] = temp;
            }
        }
        
        display(ans);
        sc.close();
	}
	public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
