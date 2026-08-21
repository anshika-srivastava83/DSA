package String;

public class vowels {
    
    static int countVowels(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch=='i' || ch =='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Anshika";
        System.out.println("The number of vowels in the string are: " + countVowels(str));

    }
}
