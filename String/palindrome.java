package String;

import java.util.Scanner;
//import java.lang.*;

public class palindrome {
    static boolean check(String str){
        //char crr[] = str.toCharArray();
        int n = str.length();
        str = str.toLowerCase();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
               return false;
            }
        }
        return true;
    }

    static boolean check2(String str){
        String reverse = "";
        str = str.toLowerCase();
        int n = str.length();
        for(int i = n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        if(str.equalsIgnoreCase(reverse))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Is the string a palindrome: "+ check(str));
        System.out.println("Is the string a palindrome(using reverse): "+ check2(str));
        sc.close();
    }
}
