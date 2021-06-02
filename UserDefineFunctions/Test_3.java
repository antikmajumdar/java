import java.util.*;
class Test_3{
    static int reverse(int n){
        int sum = 0;
        while(n > 0){
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return sum;
    }
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == reverse(n))
        System.out.print("The number is a palindrome number. ");
        else
        System.out.print("The number is not a palindrome number. ");
    }
}