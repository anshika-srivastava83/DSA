package numbers;

import java.util.Scanner;

public class countDigits {
    static int count(int num){
        int i = 0;
        while (num != 0) {
            int digit = num%10;
            i++;
            num = num/10;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.print("The total number of digits of the number are: ");
        //count(n);
        System.out.println(count(n));
        sc.close();
    }
}
