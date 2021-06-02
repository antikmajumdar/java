import java.util.*;
class Test_4{
    static void check(int n){
        int count = 0, x = n;
        while(n!=0) {
           n = n / 10; // 0
           count++; // 2
        }
        int k = (int)Math.pow(10, count);
        int s = x * x;
        int r = s % k;
        if(r == x)
        System.out.println("It is an Automorphic Number.");
        else
        System.out.println("It is not an Automorphic Number.");
    }
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}