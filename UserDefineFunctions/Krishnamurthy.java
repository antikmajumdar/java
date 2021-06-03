import java.util.*;
class Krishnamurthy{
    static int fact(int d){
        int f = 1;
        while(d != 0) {
            f = d * f;
            d--;
        }
        return f;
    }
    
    static boolean check(int n){
        int x = n;
        int sum = 0;
        
        while(x != 0) {
            sum = sum + fact(x % 10);
            x = x / 10;
        }
        
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
    
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) {
            System.out.println("It is a Krishnamurthy Number");
        } else {
            System.out.println("It is not a Krishnamurthy Number");
        }
    }
}