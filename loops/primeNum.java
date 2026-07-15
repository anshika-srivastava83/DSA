package loops;

public class primeNum {
    public static void main(String[]args){
        
        for(int n = 1;n<=100;n++){
            boolean isPrime = true;
            if (n == 1){
                isPrime = false;
            }else{
                for(int i=2; i<=n-1; i++ ){
                    if (n%i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime == true)
            System.out.println("The number "+ n +" is prime");
        }
        
    }
}
