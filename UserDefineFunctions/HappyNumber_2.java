import java.util.*;
class HappyNumber_2{
    static int calculate(int n){
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            sum = sum + r * r;
            n = n / 10;
        }
        return sum;
    }
    static boolean happy(int n){
        while(n > 9){
            n = calculate(n);
        }
        if(n == 1)
        return true;
        else
        return false;
    }
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(happy(n))
        System.out.println("It is a Happy Number.");
        else
        System.out.println("It is not a Happy Number.");
    }
}
