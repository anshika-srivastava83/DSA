package pattern;
import java.util.*;

public class pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){

            // stars = n - i and i = row-1 
            for(int col = 1; col<=n-(row-1); col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
