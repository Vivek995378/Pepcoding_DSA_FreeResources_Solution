package basicOfPepcoding;


public class PrintZ {

    public static void main(String[] args) {
        // Write your code here
        for(int i=0;i<5;i++)
        {
            if(i==0 || i==4)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int j=0;j<5-i-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}