package numbers;

import java.util.Scanner;

public class sumOfDigits {
    static int sum(int num){
        int i = 0;
        while(num!=0){
            int digit = num%10;
            i += digit;
            num = num/10;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.print("The sum is: ");
        System.out.println(sum(n));
        sc.close();
    }
}
