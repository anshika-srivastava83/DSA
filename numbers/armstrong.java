package numbers;

import java.util.Scanner;
//armstrong number -> sum of cubes of digits of a number = number itself 
//eg: 153; (1)^3 + (5)^3 + (3)^3 = 153 
public class armstrong {
    static int check(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += (digit)*(digit)*(digit);
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = sc.nextInt();
        if(check(i)==i)
            System.out.println("It's an armstrong number.");
        else
            System.out.println("It's not an armstrong number.");
        sc.close();
    }
}
