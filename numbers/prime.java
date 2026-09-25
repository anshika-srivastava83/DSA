package numbers;

import java.util.Scanner;

public class prime {
    static boolean isPrime(int num){
        int n = 2;
        boolean b = true;
        while(n<num){
            if(num%n==0)
                b = false;
            n++;
        }
        return b;
    }

    static boolean isPrime2(int num){
        int n = 2;
        while (n*n <= num){
            if(num%n==0)
                return false;
            n++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isPrime(n)==true)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number.");

        if(isPrime2(n)==true)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number.");
        sc.close();
    }
}
