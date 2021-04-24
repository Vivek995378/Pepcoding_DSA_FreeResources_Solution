package RecursionBacktracing;

import java.util.Scanner;

public class FloodFill {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean visited[][]=new boolean[n][m];
        floodfill(arr,0,0,"",visited);
        sc.close();
    }
    public static void floodfill(int[][] arr,int row, int col, String ans, boolean[][] visited) 
    {
        if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col] == 1 || visited[row][col]==true)
        {
            return;
        }
        
        if(row==arr.length-1 && col==arr[0].length-1)
        {
            System.out.println(ans);
            return;
        }
        
        visited[row][col]=true;
        floodfill(arr,row-1,col,ans+"t",visited);
        floodfill(arr,row,col-1,ans+"l",visited);
        floodfill(arr,row+1,col,ans+"d",visited);
        floodfill(arr,row,col+1,ans+"r",visited);
        visited[row][col]=false;
        
    }

}
