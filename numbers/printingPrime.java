package numbers;

import java.util.Scanner;

public class printingPrime {

    static boolean isPrime(int num){
        for(int i = 2; i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    static void print(int n){
        for(int i = 2; i<=n;i++){
            boolean prime = isPrime(i);
            if(prime==true)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = sc.nextInt();
        System.out.println("The prime numbers are: ");
        print(i);
        sc.close();
    }
}
