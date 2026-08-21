package String;
import java.util.*;

public class length_without_length {
    
    static int getLength(String str){
        int count = 0;
        char str2[] = str.toCharArray();
        for (char ch : str2) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Anshika";
        System.out.println(getLength(str));
    }
}
 