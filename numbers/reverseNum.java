package numbers;

public class reverseNum {
    static int reverse(int num){
        //we use modulus and divsion operations for getting each digit in reverse order 
        //we multiply each digit by 10 and then add the next digit and so on.. to get to the reversed number
        int ans = 0;
        while(num != 0){
            int digit = num%10;
            //ans = ans*10 + new digit
            ans = ans*10 + digit;
            num = num/10;
        }
        return ans;

    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse(num));
    }
}
