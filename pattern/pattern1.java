package pattern;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            //for each row -> n columns are there 
            for(int col = 1; col<= n; col++){
                System.out.print("* ");    
                //prints star and print is used to print the result in the same line
            }
        //to move to next line for the next row
        System.out.println();
        }
        sc.close();
    }
}
