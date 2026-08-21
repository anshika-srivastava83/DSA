package String;

public class length_without_length {
    
    static int getLength(String str){
        char str2[] = str.toCharArray();
        int count = str2.length;
        return count;
    }

    public static void main(String[] args) {
        String str = "Anshika";
        System.out.println(getLength(str));
    }
}
 