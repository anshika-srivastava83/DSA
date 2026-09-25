package numbers;

import java.util.Scanner;

public class palindrome {
    static int reverse(int num){
        int i = 0;
        while(num!=0){
            int digit = num%10;
            i = i*10+digit;
            num = num/10;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = sc.nextInt();
        if(reverse(i)==i){
            System.out.println("The number is a plaindrome");
        }
        else
            System.out.println("The number is not a plindrome");
        sc.close();
    }
}
