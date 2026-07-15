package pattern;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            // spaces + stars 

            // spaces = row - 1
            for (int col = 1; col <= row -1; col++){
                System.out.print(" ");
            }

            //stars 
            for( int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
}
