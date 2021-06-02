// Magic Number
import java.util.*;
class Test_5{
    static void check(int num){
        int n = num, r, sum = 0;
        while(n > 9){
            while(n > 0){
                r = n % 10;
                sum = sum + r;
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if(n == 1)
        System.out.println(num + " is a magic number.");
        else
        System.out.println(num + " is not a magic number.");
    }
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
    }
}