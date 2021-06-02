import java.util.*;
class Test_1{
    static int check(int n){
        int a = 0, b = 0;
        int isprime = 1;
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0)
            isprime = 0;
        }
        return isprime;
    }
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n) == 1)
        System.out.println("It is a prime number.");
        else
        System.out.println("It is not a prime number.");
    }
}