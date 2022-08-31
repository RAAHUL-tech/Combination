package combination;

import java.util.Scanner;

public class permutationcomb {

	public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner s = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        n = s.nextInt();
        System.out.print("Enter Value of r : ");
        r = s.nextInt();
 
        System.out.print("NCR is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nNPR is " +(fact(n)/(fact(n-r))));
}
}
