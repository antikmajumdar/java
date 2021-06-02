import java.util.*;
class Test_6{
    static boolean prime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
        
  
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        if (prime(n1) && prime(n2)) {
            if(Math.abs(n1 - n2) == 2)
            System.out.println("The numbers are twin primes.");
            else
            System.out.println("The numbers are not twin primes.");
        }else{
            System.out.println("Not prime.");
        }
    }
}