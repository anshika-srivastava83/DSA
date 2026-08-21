package String;
import java.util.*;

public class each_char {
    //Method 2 - as in video 
    static void printString(String str) {
        int n = str.length();
        for(int i =0; i<n;i++){
            char ch = str.charAt(i);
            System.out.println( ch);
        }
    }
    public static void main(String[] args) {
        //Method 1 - my method 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        char crr[] = str.toCharArray();
        for(char ch: crr){
            System.out.println(ch);
        }
        System.out.println();
        printString(str);
        sc.close();
    }
}
