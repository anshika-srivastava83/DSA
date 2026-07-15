package pattern;
import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            //space + star (+ space)

            //space = n - row for each column 
            for(int col = 1; col<= n-row; col++){
                System.out.print(" ");
            }

            //star
            for(int col=1; col<= (2*row)-1; col++){
                System.out.print("* ");
            }

            //space    no need for these 
            // for(int col =1; col<= n-row; col++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
        sc.close();

    }
}
