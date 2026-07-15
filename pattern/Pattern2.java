package pattern;
import java.util.*;

public class Pattern2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        if(n==m){
            System.out.println("Rows and columns cannot be same");
        }
        else{
            for(int row=1; row<=n; row++){
                for(int col = 1; col<= m; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
