package numbers;

import java.util.Scanner;

public class lcm {
    static int findgcd(int n, int m){
        while(m!=0){
            int temp = m;
            m = n%m;
            n=temp;
        }
        return n;
    }

    static int findlcm(int a, int b){                            //LCM = (a*b)/HCF
        int m = findgcd(a,b);
        int n = (a*b)/m;
        return n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i = sc.nextInt();
        System.out.println("Enter the second number: ");
        int j = sc.nextInt();
        System.out.println("The LCM of the two is: "+ findlcm(i, j));
        sc.close();
    }
}
