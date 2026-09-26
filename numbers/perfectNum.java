package numbers;

import java.util.Scanner;

public class perfectNum {
    //perfect num -> sum of divisors = number itself 
    //eg: 6; 1+2+3 = 6
    static boolean check(int num){
        int sum = 1;
        for(int i = 2; i*i<=num; i++){
            if(num%i==0){
                int firstFactor = i;
                int secondFact = num/i;
                //if(firstFactor!=num && secondFact!=firstFactor && secondFact!=num)
                sum = sum + firstFactor + secondFact;
            }
        }
        if(sum==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(check(n)==true)
            System.out.println("It's a perfect number.");
        else
            System.out.println("It's not a perfect number.");
        sc.close();
    }
}
