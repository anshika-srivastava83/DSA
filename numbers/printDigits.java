package numbers;

import java.util.Scanner;

public class printDigits {

     static void print(int num){
        while (num != 0){
            int digit = num%10;
            System.out.println(digit);
            num = num/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The digits of the number are: ");
        print(n);
        sc.close();
    }
}
