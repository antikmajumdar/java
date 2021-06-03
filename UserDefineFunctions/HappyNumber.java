import java.util.*;
class HappyNumber {
    static int cal(int n){
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            sum = sum + r*r;
            n = n / 10;
        }
        System.out.println("Sum = " + sum);
        return sum;
    }
    static boolean isHappy(int n){
        while (n > 9) {
            System.out.println("N = " + n);
            n = cal(n);
        }
        
        if (n == 1)
            return true;
        else
            return false;
    }
    static void main(){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        if(isHappy(n)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}