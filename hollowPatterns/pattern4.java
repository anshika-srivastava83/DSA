package hollowPatterns;

import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int n = sc.nextInt();

        //part 1
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++)
                System.out.print("  ");
            for(int col=1; col<=2*row-1; col++){
                if(col==1 || col==2*row-1)
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //part 2
        for(int row=1; row<=n-1; row++){
            for(int col=1; col<=row; col++)
                System.out.print("  ");
                if(row==n-1)
                    System.out.print("* ");
                else{
                    //1 star + 2(n-row)-3 spaces + 1 star

                    //1 star
                    System.out.print("* ");

                    //spaces
                    for(int col=1; col<=(2*(n-row))-3; col++){
                        System.out.print("  ");
                    }

                    //1 star
                    System.out.print("* ");
                }
            System.out.println();
        }
        sc.close();

    }
}
