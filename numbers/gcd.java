package numbers;

import java.util.Scanner;

public class gcd {
    static int findgcd(int n, int m){
        while(m!=0){
            int temp = m;
            m = n%m;
            n=temp;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i = sc.nextInt();
        System.out.println("Enter the second number: ");
        int j = sc.nextInt();
        System.out.println("The gcd of the two is: "+ findgcd(i, j));
        sc.close();
    }
}
