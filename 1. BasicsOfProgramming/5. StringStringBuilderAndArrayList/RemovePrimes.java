package StringStringBuilderAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

	public static void solution(ArrayList<Integer> al){
		// write your code here

        for(int i=al.size()-1; i>=0; i--)
		{
		    int val=al.get(i);
		    boolean b=true;
		    for(int j=2; j*j<=val; j++)
		    {
		        if(val%j==0)
		        {
		            b=false;
		            break;
		        }
		    }
		    if(b)
		    {
		        al.remove(i);
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(sc.nextInt());
		}
		solution(al);
		System.out.println(al);
		sc.close();
	}
	
}
